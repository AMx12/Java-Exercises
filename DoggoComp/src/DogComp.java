
public class DogComp {

	Dog[] dogList = new Dog[100];

	public void printPositions(int positionExclude) {
		for (Dog i : dogList) {
			if (i.getPosition() == 1) {
				System.out.println(
						"Name: " + i.getDogName() + ", Age: " + i.getDogAge() + ", Height:" + i.getDogHeight());
			} else if (i.getPosition() == positionExclude) {

			} else {
				System.out.print(returnAsPosition(i.getPosition()) + ", ");
			}
		}
	}

	public void autogenDogs() {
		for (int x = 0; x < dogList.length; x++) {
			Dog doggo = new Dog("Dog" + (x + 1), (int) (Math.random() * 10), (Math.random() * 10 + (Math.random())));
			// doggo.setDogName("Dog" + (x + 1));
			// doggo.setDogAge(5);
			// doggo.setDogHeight(6.7);
			dogList[x] = doggo;
			doggo.setPosition(x + 1);
		}
	}

	public String returnAsPosition(int pos) {
		String returned;

		if (pos == 11 || pos == 12 || pos == 13) {
			return pos + "th";
		}

		int lastNumber = pos % 10;

		switch (lastNumber) {
		case 1:
			returned = pos + "st";
			break;
		case 2:
			returned = pos + "nd";
			break;
		case 3:
			returned = pos + "rd";
			break;
		default:
			returned = pos + "th";
			break;
		}

		return returned;
	}

}
