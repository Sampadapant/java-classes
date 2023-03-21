package InnerClass;

public class innerClassPractice {
    public static void main(String[] args) {
        makeupProducts mp = new makeupProducts("low",4);
        System.out.println(mp.quality);
        System.out.println(mp.validity);

        makeupProducts.founDation fd = mp.new founDation();
        fd.coverage(); //method calling should be sequential
        fd.displayType();

    }
}
class makeupProducts{
    String quality;
    int validity;
    public makeupProducts(String q, int val){
        this.quality = q;
        this.validity = val;
    }
    class founDation{
        String type;
        public String coverage(){
            if (makeupProducts.this.quality.equals("high")){
                this.type = "liquid";
            }
            else if (makeupProducts.this.quality.equals("low")){
                this.type = "powder";
            }
            else {
                this .type = "not sure";
            }
            return this.type;
        }
        public void displayType(){
            System.out.println(this.type);
        }

    }
}
