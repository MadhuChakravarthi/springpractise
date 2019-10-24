package common;

import java.util.ArrayList;
import java.util.List;

public class LandDetails {

public static void main(String args[])
{

RetriveLandDetails ret=new RetriveLandDetails();
LandListDetails li =ret.retriveLandDetails("293807185613",10);
for(LandDetailsBean retrive:li.getLandDetailslist())
{
	
	System.out.println(retrive.get_dist_cod());
	
}
}
}
