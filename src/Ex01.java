public class Ex01 {

    public void ticoTeco() {

        for (int i = 1; i <= 100 ; i++) {
            if(i % 3 == 0 && i % 5 ==0){
                System.out.print("TicoTeco, ");
            } else {
                if(i % 3 == 0 || i % 5 ==0){
                    if(i % 3 == 0){
                        System.out.print("Tico, ");
                    }
                    if(i % 5 == 0){
                        System.out.print("Teco, ");
                    }
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
