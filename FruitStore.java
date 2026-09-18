import java.util.Scanner;

public class FruitStore {

      public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double sum = 0.0;
            double priceMandarin = 125.9;
            double pricePeach = 155.8;
            double priceApple = 151.1;
            double sum1 = 0.0;
            double countMandarin = 0.0;
            double countPeach = 0.0;
            double countApple = 0.0;
            double sum2 = 0.0;
            double sum3 = 0.0;
            System.out.print("Новый день, введите кол-во в кг фруктов на складе...\n\nМандарины: ");
            double storeMandarin = scanner.nextDouble();
            System.out.print("\n\nПерсики: ");
            double storePeach = scanner.nextDouble();
            System.out.print("\n\nЯблоки: ");
            double storeApple = scanner.nextDouble();
      
            System.out.print("\nНастройка завершена\n\n1.Мандарины\n2.Персики\n3.Яблоки\n4.Выход\n\nВведите нужный фрукт: ");
            int a = scanner.nextInt();

            while(a != 0){
                  if(a == 1){
                        System.out.print("Введите кол-во кг мандаринов: ");
                        double countMandarin1 = scanner.nextDouble();
                        if(storeMandarin - countMandarin1 < 0){
                              while(storeMandarin - countMandarin1 < 0){
                                    System.out.println("\nСтолько нет на складе, на складе осталось всего: " + storeMandarin);
                                    System.out.print("\nВведите новое кол-во кг мандаринов: ");
                                    countMandarin1 = scanner.nextDouble();
                              }
                              countMandarin += countMandarin1;
                        }
                        sum += priceMandarin * countMandarin;
                        sum1 += priceMandarin * countMandarin;
                        storeMandarin = storeMandarin - countMandarin1;
                  }
                  else if( a == 2){
                        System.out.print("Введите кол-во кг персиков: ");
                        double countPeach1 = scanner.nextDouble();
                        if(storePeach - countPeach1 < 0){
                              while(storePeach - countPeach1 < 0){
                                    System.out.println("\nСтолько нет на складе, на складе осталось всего: " + storePeach);
                                    System.out.println("\nВведите новое кол-во кг персиков: ");
                                    countPeach1 = scanner.nextDouble();
                              }
                              countPeach += countPeach1;
                        }
                        sum += pricePeach * countPeach;
                        sum2 += pricePeach * countPeach;
                        storePeach = storePeach - countPeach1;
                  }
                  else if(a == 3){
                        System.out.print("Введите кол-во кг яблок: ");
                        double countApple1 = scanner.nextDouble();
                        if(storeApple - countApple1 < 0){
                              while(storeApple - countApple1 < 0){
                                    System.out.println("\nСтолько нет на складе, на складе осталось всего: " + storeApple);
                                    System.out.println("\nВведите новое кол-во кг яблок: ");
                                    countApple1 = scanner.nextDouble();
                              }
                              countApple1 = scanner.nextDouble();
                        }
                        sum += countApple * priceApple;
                        sum3 += countApple * priceApple;
                        storeApple = storeApple - countApple1;
                  }
                  else if(a == 4){

                        break;
                  }
                  else if(a == 5){
                        if(sum1 > 0){
                              System.out.println("Кол-во/цена мандаринов: " + countMandarin + "/" + sum1);
                        }
                        else if(sum2 > 0){
                              System.out.println("Кол-во/цена персиков: " + countPeach + "/" + sum2);
                        }
                        else if(sum3 > 0){
                              System.out.println("Кол-во/цена яблок: " + countApple + "/" + sum3);
                        }
                        System.out.println("\nИтого: " + sum + "руб.\n");
                        break;
                  }
                  else{
                        System.out.println("\nТакого варианта нет сумасшедший\n");
                  }


                  if(countMandarin > 0){
                        System.out.print("\n\nДобавлено кол-во/цена мандаринов: " + countMandarin + "/" + sum1);
                  }
                  else if(countPeach > 0){
                        System.out.println("\n\nДобавлено кол-во/цена персиков: " + countPeach + "/" + sum2);
                  }
                  else if(countApple > 0){
                  System.out.println("\n\nДобавлено кол-во/цена яблок: " + countApple + "/" + sum3);
                  }
                  System.out.print("\n\n1.Мандарины\n2.Персики\n3.Яблоки\n4.Выход  \n5.Вывести сумму к оплате и выйти \n\nВведите номер пункта: ");
                  a = scanner.nextInt();
            }
      }
}