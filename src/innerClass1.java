public class innerClass1 {
    public static void main(String[] args) {
        office o = new office("Plex Pvt.Ltd","pokhara");
        System.out.println(o.officeName);
        System.out.println(o.location);

        office.department dp = o.new department();
        dp.speech();
        dp.displayDepHead();

    }
}
//how to access outer class property inside inner class
class office{
    String officeName;
    String location;
    public office(String offN, String lc){
        this.officeName = offN;
        this.location = lc;
    }
    class department{
        String departmentHead;
        public String speech(){
            if (office.this.location.equals("kathmandu")) {
                this.departmentHead = "Sandesh";
            }
            else if (office.this.location.equals("pokhara")){
                this.departmentHead = "Shakuntala";
            }
            else{
                this.departmentHead = "default";
            }
            return this.departmentHead;

            }
            public void displayDepHead(){
                System.out.println(this.departmentHead);
            }

    }


}