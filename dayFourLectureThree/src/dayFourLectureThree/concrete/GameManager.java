package dayFourLectureThree.concrete;

import dayFourLectureThree.abstracts.BaseManager;

public class GameManager implements BaseManager {

	@Override
	public void add(String message) {

		System.out.println("Game has been added: " + message);

	}

	@Override
	public void update(String message) {

		System.out.println("Game has been updated: " + message);

	}

	@Override
	public void delete(String message) {

		System.out.println("Game has been deleted: " + message);
		
	}

}
