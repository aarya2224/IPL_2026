package com.tka.IPL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPL2026 {
	public static void main(String[] args) {
		 List<Player> rcb_team = new ArrayList<>();
		  	rcb_team.add(new Player(18,"Virat Kohli",6999,5,"RCB"));
	        rcb_team.add(new Player(97,"Josh Hazlewood",120,130,"RCB"));
	        rcb_team.add(new Player(19,"Rajat Patidar",1850,5,"RCB"));
	        rcb_team.add(new Player(17,"Krunal Pandya",1650,85,"RCB"));
	        rcb_team.add(new Player(96,"Bhuvneshwar Kumar",320,190,"RCB"));
	        rcb_team.add(new Player(11,"Phil Salt",1400,0,"RCB"));
	        rcb_team.add(new Player(8,"Liam Livingstone",1600,45,"RCB"));
	        rcb_team.add(new Player(33,"Tim David",1200,10,"RCB"));
	        rcb_team.add(new Player(25,"Yash Dayal",80,45,"RCB"));
	        rcb_team.add(new Player(12,"Jitesh Sharma",950,0,"RCB"));
	        rcb_team.add(new Player(77,"Suyash Sharma",120,40,"RCB"));
	        
	     List<Player> gt_team = new ArrayList<>();
	     	gt_team.add(new Player(7,"Shubman Gill",3500,0,"GT"));
	        gt_team.add(new Player(99,"Jos Buttler",3800,0,"GT"));
	        gt_team.add(new Player(63,"Sai Sudharsan",2100,0,"GT"));
	        gt_team.add(new Player(5,"Rahul Tewatia",1100,35,"GT"));
	        gt_team.add(new Player(10,"Washington Sundar",900,65,"GT"));
	        gt_team.add(new Player(22,"Mohammed Siraj",150,110,"GT"));
	        gt_team.add(new Player(9,"Rashid Khan",650,170,"GT"));
	        gt_team.add(new Player(41,"Prasidh Krishna",60,75,"GT"));
	        gt_team.add(new Player(44,"Gerald Coetzee",80,45,"GT"));
	        gt_team.add(new Player(21,"Sai Kishore",120,55,"GT"));
	        gt_team.add(new Player(55,"Sherfane Rutherford",1000,5,"GT"));
	        
	      List<Player> rr_team = new ArrayList<>();
	      	rr_team.add(new Player(63,"Sanju Samson",4700,0,"RR"));
	        rr_team.add(new Player(19,"Yashasvi Jaiswal",2500,0,"RR"));
	        rr_team.add(new Player(17,"Riyan Parag",1500,15,"RR"));
	        rr_team.add(new Player(99,"Shimron Hetmyer",1700,0,"RR"));
	        rr_team.add(new Player(25,"Dhruv Jurel",900,0,"RR"));
	        rr_team.add(new Player(18,"Wanindu Hasaranga",600,100,"RR"));
	        rr_team.add(new Player(90,"Jofra Archer",250,65,"RR"));
	        rr_team.add(new Player(11,"Sandeep Sharma",100,130,"RR"));
	        rr_team.add(new Player(28,"Maheesh Theekshana",180,75,"RR"));
	        rr_team.add(new Player(45,"Tushar Deshpande",80,55,"RR"));
	        rr_team.add(new Player(8,"Nitish Rana",2300,20,"RR"));
	        
	      List<Player> srh_team = new ArrayList<>();
	      srh_team.add(new Player(9,"Pat Cummins",650,75,"SRH"));
	        srh_team.add(new Player(87,"Travis Head",2200,5,"SRH"));
	        srh_team.add(new Player(38,"Abhishek Sharma",1800,18,"SRH"));
	        srh_team.add(new Player(95,"Heinrich Klaasen",2600,0,"SRH"));
	        srh_team.add(new Player(5,"Ishan Kishan",2800,0,"SRH"));
	        srh_team.add(new Player(13,"Nitish Kumar Reddy",900,20,"SRH"));
	        srh_team.add(new Player(21,"Harshal Patel",350,145,"SRH"));
	        srh_team.add(new Player(44,"Mohammed Shami",500,130,"SRH"));
	        srh_team.add(new Player(33,"Rahul Chahar",250,65,"SRH"));
	        srh_team.add(new Player(15,"Adam Zampa",300,95,"SRH"));
	        srh_team.add(new Player(18,"Kamindu Mendis",700,12,"SRH"));
	        
	        Map<String, List<Player>> ipl_2026_db = new HashMap<>();

	        ipl_2026_db.put("RCB", rcb_team);
	        ipl_2026_db.put("GT", gt_team);
	        ipl_2026_db.put("RR", rr_team);
	        ipl_2026_db.put("SRH", srh_team);
	        
	        for (String team : ipl_2026_db.keySet()) {

	            System.out.println("\nTeam : " + team);

	            for (Player p : ipl_2026_db.get(team)) {
	                System.out.println(p);
	            }
	        
	        
	}
  }
}
