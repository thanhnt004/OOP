package hinhtron;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(){
        super(0.0);
    }
    public ResizableCircle(double radius)
    {
         super(radius);
    }
    @Override
    public void resize(int percent) {
        this.radius  = this.radius*percent/100;
    }
    
}
