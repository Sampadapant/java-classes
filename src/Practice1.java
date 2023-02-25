public class Practice1 {
 public static void main(String[] args) {
  //length of string
  String sen = "I want to learn javascript";
  int a = sen.length();
  System.out.println(a);
  System.out.println(sen.length()); //same

  String sen1 = "please speak softly";
  int a1 = sen1.length();
  System.out.println(a1);
  System.out.println(sen1.length());

  String s1 = "I am learning java";
  String s2 = " everyday in the evening.";
  String join = s1.concat(s2);
  System.out.println(join);

  String sen2 = "It is sunny day today";
  String sen3 = sen2.toUpperCase();
  System.out.println(sen3);

  String sen4 = "Kathmandu";
  System.out.println(sen4.length());

  String capital = "Kathmandu";
  int capital1 = capital.toUpperCase().toLowerCase().length();
  System.out.println(capital1);

  String city = "Arlington";
  String city1 = "Irving";
  String city2 = "Bedford";
  boolean output = city.equals(city1);
  //System.out.println(output);
  if (output) {
   System.out.println("pick next city");
  } else {
   System.out.println("city and city1 are not equal");
  }

  String output1 = city.equals(city1) ? "equal" : "not equal";
  System.out.println(output1);

  String b = "Nawalparasi";
  boolean b1 = b.startsWith("N");
  System.out.println(b1);

  String b2 = "Dhapasi";
  boolean b3 = b2.endsWith("p");
  System.out.println(b3);

  String sen5 = "I am going to visit my parents";
  String sen6 = sen5.replace("am", "was");
  System.out.println(sen6);

  String sen7 = "I am going to visit my parents";
  String sen8 = sen7.replace("m", "n");
  System.out.println(sen8);

  String sen9 = "I am going to attend party";
  String sen10 = sen9.replaceAll("party", "meeting");
  System.out.println(sen10);

  String city3 = "Bharatpur";
  city3.charAt(5);
  System.out.println(city3.charAt(5));
  System.out.println(city3.length());

  String place = "Chitwan";
  //int place1 = place.length();
  //System.out.println(place1);
  //for (int i =0; i<place1; i++){
  //System.out.println(i);
  //System.out.println(place.charAt(i));
  for (int i = 0; i < place.length(); i++) {
   //System.out.println(i);
   System.out.println(place.charAt(i));
  }
  String place2 = "bagmati";
  String rev = "";
  for (int i =0; i<place2.length(); i++) {
   rev = place2.charAt(i) + rev;

  }
  System.out.println(rev);

  String aa = "water melon";
  int count = 0;
  for (int i =0; i <aa.length(); i ++){
   System.out.println(i);
   System.out.println(aa.charAt(i));
   if (aa.charAt(i)=='a' || aa.charAt(i)=='e' || aa.charAt(i)== 'i'|| aa.charAt(i)=='o'||aa.charAt(i)=='u') {
    count = count + 1;
   }
  }
  System.out.println(count);

  String str = "java is fun";
  String str1 = str.substring(1,4);
  System.out.println(str1);

  String country = "Nepal";
  int c = country.indexOf("p");
  System.out.println(c);

  String ss = "I am from another nation";
  for (int i = 0; i <ss.length(); i++) {
   if(ss.charAt(i) =='a'){
    System.out.println(i);

    String sss = "I am learning java";
    String [] ss1 = sss.split(" ");
    System.out.println(ss1);
   }
  }
  String cities [] = new String [3];
  cities [0] = "Kathmandu";
  cities [1] = "Pokhara";
  cities [2]= "Dharan";
  for (int i = 0; i <cities.length; i ++){
   System.out.println(i);
   System.out.println(cities[i]);
  }

  int num []= {0,1,2,3,4} ;
  for (int i =0; i<num.length; i++){
   System.out.println(i);
   System.out.println(num[i]);
  }
  String name = "sampada";
  char [] n = name.toCharArray();
  for (int i = 0; i <n.length; i++){
   System.out.println(n[i]);
  }
  //array of string
  String a11 = "I am practicing right now";
  String pp [] = a11.split(" ");
  for (int i =0; i<pp.length; i++){
   System.out.println(pp[i]);
  }
  String str11 = "23/78/45/78/2099";
  String a13 []= str11.split("/");
  for(int i= 0; i < a13.length; i++) {
   // System.out.println(i);
   System.out.println(a13[i]);
  }

  String sen22 = "the weather today is very hot";
  String r [] = sen22.split("a");
  for (int i= 0; i < r.length; i++) {
   //System.out.println(i);
   System.out.println(r[i]);
  }
  int numbss []= {22,33,33,29};
  int sum = 0;
  for (int i = 0; i <numbss.length; i ++){
   sum = sum + numbss[i];
  }
  System.out.println(sum);

  String cityN = "Dharan";
  char [] cc = cityN.toCharArray();
  for (int i =0; i<cc.length; i++){
   System.out.println(cc[i]);
  }
  int score []= {89, 32, 45,56,67};
  for (int i :score) {
   System.out.println(i);
  }

  char [] abc = {'m','a','n','g','o'};
   String rev1 = "";
   for (char abc1 :abc){
    rev1 = rev1 + abc1;
   }
   System.out.println(rev1);

  int [][] as = {
          {1,2,3},
          {44,55,66,77},
          {111,333}

  };
  System.out.println(as[1][3]);
  for (int i =0; i<as.length; i ++){
   //System.out.println(i);
   //System.out.println(as[i]);
   System.out.println(as[i].length);
   int asa []= as[i];
   for (int j =0; j<asa.length; j++)
    System.out.println(asa[j]);
  }


  }
 }



