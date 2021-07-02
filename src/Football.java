
public class Football extends TeamSport implements IPlay {
	
	private String teamOne;
	private String teamTwo;
	private String refree;
	

	public Football(String name, int players, String type, int teamPlayers, String teamOne, String teamTwo,
			String refree) {
		super(name, players, type, teamPlayers);
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.refree = refree;
	}

	@Override
	public void playAsTeam() {
		System.out.println("Kick football to start the game");
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getRefree() {
		return refree;
	}

	public void setRefree(String refree) {
		this.refree = refree;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int stop() {
		// TODO Auto-generated method stub
		return 0;
	}

}
