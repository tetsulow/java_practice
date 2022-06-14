public class Quiz {
  public static void main(String[] args){
    System.out.println("\n■トランプのJは何を表しているでしょう？");
    System.out.println("\n1: 王子 2: 召使い 3: 貧乏人");
    System.out.print("\n\n正解を入力＞");
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int d = sc.nextInt();

    if(d==1){
    System.out.println("\n\n不正解！");
    System.out.println("正解は2の台湾です。");
    }
    else if(d==2){
    System.out.println("\n\n正解！ 1998年台北でオープンした「猫花園」が猫カフェ発祥の地");
    }
    else if(d==3){
    System.out.println("\n\n不正解！");
    System.out.println("正解は2の台湾です。");
    }
    else {
    System.out.println("\n\n1～3の番号を入力して下さい。");
    }
  }
}