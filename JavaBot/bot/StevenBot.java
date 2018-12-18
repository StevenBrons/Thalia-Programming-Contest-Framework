
public class StevenBot implements Bot{

	StevenBot() {
		
	}

	@Override
	public void initialize(GameState state) {
		
	}

	@Override
	public Move nextMove(GameState state) {
		return new Move(state.getYou().getLegalDirs(state).get(0), false);
	}
}
