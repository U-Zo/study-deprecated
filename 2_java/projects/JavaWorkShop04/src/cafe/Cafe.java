package cafe;

public class Cafe {
    private Coffee[] coffeeList;
    private int index;

    public Cafe() {
        coffeeList = new Coffee[10];
    }

    public int totalPrice() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            total += coffeeList[i].getPrice();
        }

        return total;
    }

    public void setCoffee(Coffee coffee) {
        if (index == 10) {
            System.out.println("더 이상 커피 메뉴를 추가할 수 없습니다.");
        } else {
            coffeeList[index++] = coffee;
        }
    }

    public Coffee[] getCoffeeList() {
        return coffeeList;
    }

    public int getIndex() {
        return index;
    }
}
