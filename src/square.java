public class square {
    //fields
    int side;
    int x0;
    int y0;
    //properties
    public int getSide(){return side;}
    public void setSide (int side) throws Exception {
        if (this.side <= 10){ this.side = side;
        }
        else {throw new Exception(("Error"));
        }
    }
    public int getX0(){return x0;}
    public void setX0 (int x0) throws Exception {
        if (this.x0 <= 5){this.x0 = x0;
        }
        else {throw new Exception(("Error"));
        }
    }
    public int getY0(){return y0;}
    public void setY0(int y0) throws Exception {
        if (this.y0 <= 5){ this.y0 = y0;
        }
        else {throw new Exception(("Error"));
        }
    }
    //methods
    public int perimetre (){
        return this.side*4;
    }
    public int area (){
        return this.side*this.side;
    }
    public int inscribedcircleradius (){
        return this.side/2;
    }
    public int circimscribedradius (){
        return (int) (this.side/Math.sqrt(2));
    }
    public double calculatediagonal (){
        return this.side*Math.sqrt(2);
    }
    //constructors
    public square() {
        this.side = 1;
        this.x0 = 0;
        this.y0 = 0;
    }
    public square (int side, int x0, int y0){
        this.side = side;
        this.x0 = x0;
        this.y0 = y0;
    }
}