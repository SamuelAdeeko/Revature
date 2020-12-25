package demoInheritance;

public class Players extends Person {
	
	private int playerNo;
	private String nationality;
	private String position;
	private boolean captain;
	private Team team;
	
	

	public Players(int id, String name, int playerNo, String nationality, String position, boolean captain, Team team) {
		super(id, name);
		this.playerNo = playerNo;
		this.nationality = nationality;
		this.position = position;
		this.captain = captain;
		this.team = team;
	}

	public Players() {
		
	}

	public Players(String name, int playerNo, String nationality, String position, boolean captain) {
		super(name);
		this.playerNo = playerNo;
		this.nationality = nationality;
		this.position = position;
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Players [playerNo=" + playerNo + ", nationality=" + nationality + ", position=" + position
				+ ", captain=" + captain + ", team=" + team + "]";
	}

	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	public void printPlayer() {
		System.out.println("\nPlayer Name: " + getName());
		System.out.println("\nPlayer Number: " + getPlayerNo());
		System.out.println("\nPlayer Team: " + getNationality());
		System.out.println("\nPlayer Position: " + getPosition());
		System.out.println("\nPlayer Captain: " + isCaptain());
		System.out.println("\nPlayer Team: " + getTeam());
	}
	
	
	
	
	
	
	
	
	
	
}
