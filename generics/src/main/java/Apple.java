import lombok.Data;

@Data
public class Apple extends Item{
   private String model;

    public Apple(String color, int size, String model) {
        super(color, size);
        this.model = model;
    }
}
