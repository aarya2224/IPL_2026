package com.tka.IPL;

public class Player {

    private int jerseyNo;
    private String name;
    private int runs;
    private int wickets;
    private String teamName;

    public Player(int jn, String n, int r, int w, String tn) {
        jerseyNo = jn;
        name = n;
        runs = r;
        wickets = w;
        teamName = tn;
    }

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jn) {
		this.jerseyNo = jn;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int r) {
		this.runs = r;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int w) {
		this.wickets = w;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String tn) {
		this.teamName = tn;
	}
	
	@Override
	public String toString() {
	    return jerseyNo + " " + name + " " + runs + " " + wickets + " " + teamName;
	}
}
    
