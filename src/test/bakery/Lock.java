package test.bakery;

public interface Lock {
	public void requestCS(int id);
	public void releaseCS(int id);
}
