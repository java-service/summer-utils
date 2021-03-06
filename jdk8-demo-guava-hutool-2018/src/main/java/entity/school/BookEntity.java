package entity.school;

import entity.poly.ICircle;

/**
 * 面向对象的第?个例?
 *
 * @author Luo_0412
 */
public class BookEntity {
    private String title;
    private String press; // 出版?
    private String ISBN;
    private double price;

    /**
     * 无参构?函?
     */
    public BookEntity() {
        this(null, null, null, 100); // 使用this调用另一个构造方???
    }

    /**
     * 有参构?函?
     *
     * @param bookTitle
     * @param bookPress
     * @param bookISBN
     * @param bookPrice
     */
    public BookEntity(String bookTitle, String bookPress, String bookISBN, double bookPrice) {
        // title = bookTitle;
        // press = bookPress;
        // ISBN = bookISBN;
        // price = bookPrice;

        this.title = bookTitle;
        this.press = bookPress;
        this.ISBN = bookISBN;
        this.price = bookPrice;

    }

    /**
     * setter集合
     *
     * @param bookTitle
     */
    public void setTitle(String bookTitle) {
        this.title = bookTitle;
    }

    public void setPress(String bookPress) {
        this.press = bookPress;
    }

    public void setISBN(String bookISBN) {
        this.ISBN = bookISBN;
    }

    public void setPrice(double bookPrice) {
        this.price = bookPrice;
    }

    /**
     * getter集合
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    public String getPress() {
        return press;
    }

    public String getISBN() {
        return ISBN;
    }

    public Double getPrice() {
        return price;
    }

    public static class Circle implements ICircle {
        @Override
        public double getCircumference(double radius) {
            return 2 * PI * radius;
        }

        @Override
        public double getArea(double radius) {
            return PI * radius * radius;
        }

        @Override
        public double getVolume(double radius) {
            return 4 * PI * radius * radius * radius / 3.0;
        }
    }
}
