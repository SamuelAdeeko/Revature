package demoInheritance;

public class Team {
	
	private String teamName;
	private int teamLicenseNumber;
	private String teamCoach;
	private int teamRating;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String teamName, int teamLicenseNumber, String teamCoach, int teamRating) {
		this.teamName = teamName;
		this.teamLicenseNumber = teamLicenseNumber;
		this.teamCoach = teamCoach;
		this.teamRating = teamRating;
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamLicenseNumber=" + teamLicenseNumber + ", teamCoach=" + teamCoach
				+ ", teamRating=" + teamRating + "]";
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getTeamLicenseNumber() {
		return teamLicenseNumber;
	}

	public void setTeamLicenseNumber(int teamLicenseNumber) {
		this.teamLicenseNumber = teamLicenseNumber;
	}

	public String getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

	public int getTeamRating() {
		return teamRating;
	}

	public void setTeamRating(int teamRating) {
		this.teamRating = teamRating;
	}
}
