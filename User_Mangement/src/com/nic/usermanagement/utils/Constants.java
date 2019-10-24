package com.nic.usermanagement.utils;

public interface Constants 
{
        public String ERRORPAGE="errorpage";
        
	public String LOGINPAGE="loginpage";
        public String WELCOMEPAGE="welcomepage";
	public String DASHBOARD="dashboard";
        public String ENTRYPAGE="entryform";
	public String URLEXTENTION=".do";
	public String INITMODULE="login";
	public String ROLEID="ROLE_ID";
        public String REGISTERPAGE="registerpage";
        public String REGISTERPAGE2="registerpage2";
        public String LOGINAUTHPAGE="loginauthpage";
        public String DDOLOGINAUTHPAGE="ddologinauthpage";
        public String REGISTERINSERT="INSERT INTO user_mst(user_name, password, full_name, role_id, statecode, email, mobile) VALUES (?, ?, ?, ?, ?, ?, ?)";
        public String LOGINSQL="SELECT ID,ROLE_ID,USER_NAME,FULL_NAME FROM USER_MST WHERE USER_NAME=?  and is_active='true'";//md5(PASSWORD)
	//public String LOGINSERVICES="SELECT  l.id, l.pid, l.name, l.sid, l.path, l.mid, l.is_active,l.position FROM links_master l join role_links rl on l.id=rl.link_id and rl.role_id=? where l.is_active=true order by l.pid,l.sid";
        public String LOGINSERVICES="(SELECT  l.id as id, l.pid, l.name, l.sid, l.path, l.mid, l.is_active,l.position FROM links_master l join role_links rl on l.id=rl.link_id and rl.role_id=? where l.is_active is true and l.position='SHOW' ) UNION (SELECT  l.id, l.pid, l.name, l.sid, l.path, l.mid, l.is_active,l.position FROM links_master l where l.is_active is true and l.position='HIDE')";
        
        public String MEETINGSERVICES="select meeting_id,to_char(meeting_date,'dd-mm-yyyy') as meetingdate,time,(select venuename as meeting_venue from venumaster v where v.venueid=m.meeting_venue) from meeting_schedule m where meeting_status=true";
        
        public String LOGINLDAPSQL="SELECT ID,ROLE_ID,USER_NAME,FULL_NAME FROM USER_MST WHERE USER_NAME=?  AND is_active='true'";//md5(PASSWORD)
        
        
        public String FAILURE="failurepage";
        
       
        
        
        
        
        
}