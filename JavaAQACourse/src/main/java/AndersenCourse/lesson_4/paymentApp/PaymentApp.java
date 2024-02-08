package AndersenCourse.lesson_4.paymentApp;

public class PaymentApp {
    //Task 6 - Создать класс Payment с внутренним классом,
    //с помощью объектов которого можно сформировать покупку из нескольких товаров.
    public static void main(String[] args) {
        Payment cartOne = new Payment();
        cartOne.addToCart("Oranges", 3, 5);
        cartOne.addToCart("Apples", 10, 3);
        cartOne.addToCart("Sweets", 7, 4);
        cartOne.displayProducts();
        cartOne.showTotalSum();
        Payment cartTwo = new Payment();
        cartTwo.addToCart("Potatoes", 0, -15);
        cartTwo.showTotalSum();
        cartTwo.displayProducts();
    }
}
