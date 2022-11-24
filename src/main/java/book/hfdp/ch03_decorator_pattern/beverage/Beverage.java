package book.hfdp.ch03_decorator_pattern.beverage;

// 원래 interface로 대부분 사용한다
public abstract class Beverage {
    String description = "제목 없음";
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL; // 기본이 tall



    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize(){
        return this.size;
    }

    public abstract double cost();
}
