package ders08_Ternary_switch;

public class C08_SwitchCase {
    public static void main(String[] args) {


        //kullanicidan ay numarasini alip hangi mevsim oldugunu yazdirin
        int ayNo = 5;
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;

                case 3:
                case 4:
                case 5:
                    System.out.println("ilkbahar");
                    break;

                    case 6:
                    case 7:
                    case 8:
                        System.out.println("yaz");
                        break;

                        case 9:
                        case 10:
                        case 11:
                            System.out.println("sonbahar");
                            break;
                        default:
                            System.out.println("gecersiz ay numarasi");


                    }
                }
            }


