package HomeWork.task1;

public class HW1 {

    // Создайте две переменные isWeekend и isRain.
    // Создайте переменную canWalk, значение которой должно быть истинным,
    // если это выходной день (isWeekend=true) и не идет дождь (isRain=false).
    //Создайте две переменные isEdekaOpen и isReweOpen,
    // значения которых зависят от того, открыты магазины или нет.
    // Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true,
    // если хотя бы один магазин открыт, иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.


    static void hikingCondition(boolean isWeekend, boolean isRainy, boolean isCanWalk) {
        if (isCanWalk && !isRainy && isWeekend) {
            System.out.println("let's go to walk!");
        } else {
            if (isWeekend && isRainy) {
                System.out.println("I am busy today, sorry");
            } else if (isWeekend && isCanWalk) {
                System.out.println("let's go to walk!");
            }
        }
    }


    public static void main(String[] args) {
        boolean isEdekaOpen = false;
        boolean isRewaOpen = true;
        boolean isCanBuy;
        if (isEdekaOpen || isRewaOpen) {
            isCanBuy = true;
        }

        HW1.Shop shop = new HomeWork.task1.HW1.Shop(isEdekaOpen, isRewaOpen);
        String shopName = " ";
        if (shop.canBuy()) {
            if (shop.isEdekaOpen && !shop.isRewaOpen) {
                shopName = "Edeka";
            } else if (!shop.isEdekaOpen && shop.isRewaOpen) {
                shopName = "Rewe";
            } else if (shop.isEdekaOpen && shop.isRewaOpen) {
                shopName = "Edeka или Rewe";
            }
            System.out.println("Я могу купить еду в " + shopName);
        } else {
            System.out.println("Я не могу купить еду ");
        }
    }

    static class Shop {
        private boolean isEdekaOpen;
        private boolean isRewaOpen;

        public Shop(boolean isEdekaOpen, boolean isRewaOpen) {
            this.isEdekaOpen = isEdekaOpen;
            this.isRewaOpen = isRewaOpen;
        }

        public boolean canBuy() {
            return isEdekaOpen || isRewaOpen;
        }
    }
}


