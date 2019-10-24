package com.nic.projectproposal.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.nic.projectproposal.dao.MongoFileStorageDAO;
import com.nic.projectproposal.model.PpCategoryDetails;
import com.nic.projectproposal.model.PpGeneralDetails;
import com.nic.projectproposal.model.PpOutsourcingOfTheProjectActivities;
import com.nic.projectproposal.model.PpWelfareCost;
import com.nic.projectproposal.service.ProjectProposalService;

@Controller
public class ProjectProposalController {

	@RequestMapping("/generalInterface")
	public String userInterface(Model model) {
		PpGeneralDetails general = new PpGeneralDetails();
		model.addAttribute("general", general);
		// List<Object[]> role=userService.getRoles();
		// Map<Integer,String> rolesMap = new HashMap<Integer,String>();
		// for (Object[] i : role) rolesMap.put((Integer)i[0],(String)i[1]);

		// List<Roles> rolesMap= userService.getRoles();
		// model.addAttribute("rolesList", rolesMap);
		return "general";
	}

	@RequestMapping(value = "/generalEntry", method = RequestMethod.POST)
	public String userInsertion(@Valid @ModelAttribute("general") PpGeneralDetails project, BindingResult result,
			Model model, HttpServletRequest req) {

		HttpSession session = req.getSession(true);
		if (result.hasErrors()) {
			model.addAttribute("user", project);

			return "general";
		}

		else {
			int project_proposal_code = generalService.generalCreation(project);
			System.out.println("PPCODE" + project_proposal_code);
			session.setAttribute("projectproposalcode", project_proposal_code);
			model.addAttribute("message", "Successfully User Created");
			model.addAttribute("user", project);
			return "general";
		}

	}

	@RequestMapping("/categoryInterface")
	public String categoryInterface(Model model) {

		PpCategoryDetails category = new PpCategoryDetails();

		model.addAttribute("category", category);
		return "category";
	}

	@RequestMapping(value = "/categoryEntry", method = RequestMethod.POST)
	public String categoryInsertion(@Valid @ModelAttribute("category") PpCategoryDetails category, BindingResult result,
			Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		if (result.hasErrors()) {

			model.addAttribute("category", category);

			return "category";
		}

		else {

			System.out.println("getSession" + (Integer) session.getAttribute("projectproposalcode"));
			category.setProject_proposal_id((Integer) session.getAttribute("projectproposalcode"));
			generalService.categoryCreation(category);
			model.addAttribute("message", "Successfully User Created");
			model.addAttribute("category", category);
			return "category";
		}

	}

	@RequestMapping("/welfareInterface")
	public String welfareInterface(Model model) {
		PpWelfareCost welfare = new PpWelfareCost();
		model.addAttribute("welfare", welfare);
		return "welfare";
	}

	@RequestMapping("/outsourcingInterface")
	public String outsourceInterface(Model model) {
		PpOutsourcingOfTheProjectActivities outsource = new PpOutsourcingOfTheProjectActivities();
		model.addAttribute("outsource", outsource);
		return "outsource";
	}

	@RequestMapping(value = "/welfareEntry", method = RequestMethod.POST)
	public String welfareInsertion(@Valid @ModelAttribute("welfare") PpWelfareCost welfare, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("welfare", welfare);

			return "welfare";
		}

		else {
			generalService.welfareCreation(welfare);
			model.addAttribute("message", "Successfully User Created");
			model.addAttribute("welfare", welfare);
			return "welfare";
		}

	}

	@RequestMapping(value = "/outsourceEntry", method = RequestMethod.POST)
	public String welfareInsertion(@Valid @ModelAttribute("outsource") PpOutsourcingOfTheProjectActivities outsource,
			BindingResult result, Model model) {
		List<String> contentTypes = Arrays.asList("application/png", "application/jpeg", "image/png", "image/jpeg");
		try {
			if (result.hasErrors())

			{
				model.addAttribute("outsource", outsource);

				return "outsource";
			}

			else {
				boolean b = true;
				
				b = b && (contentTypes.contains(outsource.getMouasoutsourcepartner().getContentType()));
				b = b && (contentTypes.contains(outsource.getRegistrationcertficate().getContentType()));
				b = b && (contentTypes.contains(outsource.getBankstatement().getContentType()));
				b = b && (contentTypes.contains(outsource.getCheckleaf().getContentType()));
				b = b && (contentTypes.contains(outsource.getBalancesheet().getContentType()));
				b = b && (contentTypes.contains(outsource.getEmployeelist().getContentType()));
				if (b)

				{

					DBObject metaData = new BasicDBObject();
					metaData.put("createdby", "me");
					metaData.put("roleid", 1);
					metaData.put("ppcode", 1);

					String id = mongoFileStorageDao.store(outsource.getMouasoutsourcepartner().getInputStream(),
							outsource.getMouasoutsourcepartner().getOriginalFilename(), "image/jpeg", metaData);
					id = mongoFileStorageDao.store(outsource.getRegistrationcertficate().getInputStream(),
							outsource.getRegistrationcertficate().getOriginalFilename(), "image/jpeg", metaData);
					id = mongoFileStorageDao.store(outsource.getBankstatement().getInputStream(),
							outsource.getBankstatement().getOriginalFilename(), "image/jpeg", metaData);
					id = mongoFileStorageDao.store(outsource.getCheckleaf().getInputStream(),
							outsource.getCheckleaf().getOriginalFilename(), "image/jpeg", metaData);
					id = mongoFileStorageDao.store(outsource.getBalancesheet().getInputStream(),
							outsource.getBalancesheet().getOriginalFilename(), "image/jpeg", metaData);
					id = mongoFileStorageDao.store(outsource.getEmployeelist().getInputStream(),
							outsource.getEmployeelist().getOriginalFilename(), "image/jpeg", metaData);

					// System.out.println(id+"-----"+project.getMyfile().getName()+"----"+project.getMyfile().getOriginalFilename()+"---"+project.getMyfile().getContentType());
					generalService.outsourceCreation(outsource);
					model.addAttribute("message", "Successfully User Created");
					model.addAttribute("outsource", outsource);
					return "outsource";

				} else {
					model.addAttribute("message", "Please Upload either JPEG image or PNG image");
					model.addAttribute("outsource", outsource);
					return "outsource";
				}

			}
		}

		catch (Exception e) {
		}
		return "outsource";
	}

	@Autowired
	private ProjectProposalService generalService;
	@Autowired
	private MongoFileStorageDAO mongoFileStorageDao;

}