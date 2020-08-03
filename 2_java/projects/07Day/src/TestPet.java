
public class TestPet {

	public static void main(String[] args) {

		// 고양이 2마리,강아지 1마리 ,물고기 1마리
		Cat c = new Cat("야옹이", 3, "암놈");
		Cat c2 = new Cat("하늘이", 1, "숫놈");
		Dog d = new Dog("누렁이", 8, "암놈", "검정");
		Fish f = new Fish("골드", 1, "숫놈", 163.3);

		System.out.println(c.getName() + "\t" + c.getAge() + "\t" + c.getGender());
		c.eatCat();
		c.cryCat();
		c.sleepCat();
		System.out.println(c2.getName() + "\t" + c2.getAge() + "\t" + c2.getGender());
		c2.eatCat();
		c2.cryCat();
		c2.sleepCat();
		System.out.println(d.getName() + "\t" + d.getAge() + "\t" + d.getGender() + "\t" + d.getColor());
		d.eatDog();
		d.cryDog();
		d.sleepDog();
		d.runDog();
		System.out.println(f.getName() + "\t" + f.getAge() + "\t" + f.getGender() + "\t" + f.getTailSize());
		f.swimFish();
	}

}
