package ru.relex.controller;


import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.webapp.WebAppInfo;


import java.util.List;

public class MenuOfCompetencies{

    protected InlineKeyboardMarkup vacancy;

    protected MenuOfCompetencies(){
        createMenu();
    }

    private void createMenu(){
        var startButton = new InlineKeyboardButton();
        startButton.setText("Нажмите для запуска приложения");
        startButton.setWebApp(new WebAppInfo("https://competency.jobster.uz"));
        vacancy = InlineKeyboardMarkup.builder().keyboardRow(List.of(startButton)).build();
    }
//    private void createMenu(){
//        var shopManager = InlineKeyboardButton.builder().text("Менеджер магазина").callbackData("Менеджер магазина").build();
//        var deputyStoreManager = InlineKeyboardButton.builder().text("Заместитель менеджера магазина").callbackData("Заместитель менеджера магазина").build();
//        var gymAdministrator = InlineKeyboardButton.builder().text("Администратор спортзала").callbackData("Администратор спортзала").build();
//        var cashier = InlineKeyboardButton.builder().text("Кассир").callbackData("Кассир").build();
//        var layoutSpecialist = InlineKeyboardButton.builder().text("Специалист по выкладке товаров").callbackData("Специалист по выкладке товаров").build();
//        var warehouseWorker = InlineKeyboardButton.builder().text("Складской работник").callbackData("Складской работник").build();
//        var productionManager = InlineKeyboardButton.builder().text("Производственный менеджер").callbackData("Производственный менеджер").build();
//        var shiftSupervisor = InlineKeyboardButton.builder().text("Начальник смены").callbackData("Начальник смены").build();
//        var productionLineOperator = InlineKeyboardButton.builder().text("Оператор производственной линии").callbackData("Оператор производственной линии").build();
//        var locksmith = InlineKeyboardButton.builder().text("Слесарь").callbackData("Слесарь").build();
//        var qualityController = InlineKeyboardButton.builder().text("Контролер качества").callbackData("Контролер качества").build();
//        var restaurantManager = InlineKeyboardButton.builder().text("Менеджер ресторана").callbackData("Менеджер ресторана").build();
//        var restaurantAdministrator = InlineKeyboardButton.builder().text("Администратор ресторана").callbackData("Администратор ресторана").build();
//        var cooker = InlineKeyboardButton.builder().text("Шеф-повар").callbackData("Шеф-повар").build();
//        var sousChef = InlineKeyboardButton.builder().text("Су-шеф").callbackData("Су-шеф").build();
//        var waiter = InlineKeyboardButton.builder().text("Официант").callbackData("Официант").build();
//        var barista = InlineKeyboardButton.builder().text("Бариста").callbackData("Бариста").build();
//        var dishwasher = InlineKeyboardButton.builder().text("Посудомойщик").callbackData("Посудомойщик").build();
//        var spotManager = InlineKeyboardButton.builder().text("Менеджер точки").callbackData("Менеджер точки").build();
//        var seniorCashier = InlineKeyboardButton.builder().text("Старший кассир").callbackData("Старший кассир").build();
//        var kitchenWorker = InlineKeyboardButton.builder().text("Работник кухни").callbackData("Работник кухни").build();
//        var customerServiceSpecialist = InlineKeyboardButton.builder().text("Спец. по обслуживанию клиентов").callbackData("Специалист по обслуживанию клиентов").build();
//        var logisticsManager = InlineKeyboardButton.builder().text("Менеджер по логистике").callbackData("Менеджер по логистике").build();
//        var courier = InlineKeyboardButton.builder().text("Курьер").callbackData("Курьер").build();
//        var clientRelationshipSpecialist = InlineKeyboardButton.builder().text("Спец. по работе с клиентами").callbackData("Специалист по работе с клиентами").build();
//        var logist = InlineKeyboardButton.builder().text("Логист").callbackData("Логист").build();
//        var equipmentMaintenanceEngineer = InlineKeyboardButton.builder().text("Инж. по обслуживанию оборуд.").callbackData("Инженер по обслуживанию оборудования").build();
//        var warehouseSupervisor = InlineKeyboardButton.builder().text("Контролер на складе").callbackData("Контролер на складе").build();
//        var deliveryCoordinator = InlineKeyboardButton.builder().text("Координатор доставки").callbackData("Координатор доставки").build();
//        var forwardingDriver = InlineKeyboardButton.builder().text("Водитель-экспедитор").callbackData("Водитель-экспедитор").build();
//        var sellingManager = InlineKeyboardButton.builder().text("Менеджер по продажам").callbackData("Менеджер по продажам").build();
//        var salesRepresentative = InlineKeyboardButton.builder().text("Торговый представитель").callbackData("Торговый представитель").build();
//        var salesAssistant = InlineKeyboardButton.builder().text("Продавец-консультант").callbackData("Продавец-консультант").build();
//        var salesFloorCoordinator = InlineKeyboardButton.builder().text("Координатор торгового зала").callbackData("Координатор торгового зала").build();
//        var dataScientist = InlineKeyboardButton.builder().text("Аналитик по данным").callbackData("Аналитик по данным").build();
//        var storekeeper = InlineKeyboardButton.builder().text("Кладовщик").callbackData("Кладовщик").build();
//        var purchasingManager = InlineKeyboardButton.builder().text("Менеджер по закупкам").callbackData("Менеджер по закупкам").build();
//        var callCentreOperator = InlineKeyboardButton.builder().text("Оператор колл-центра").callbackData("Оператор колл-центра").build();
//        var packagingSpecialist = InlineKeyboardButton.builder().text("Специалист по упаковке").callbackData("Специалист по упаковке").build();
//        var receivingSpecialist = InlineKeyboardButton.builder().text("Специалист по приему товара").callbackData("Специалист по приему товара").build();
//
//        competencies1part = InlineKeyboardMarkup.builder()
//                .keyboardRow(List.of(shopManager))
//                .keyboardRow(List.of(deputyStoreManager))
//                .keyboardRow(List.of(gymAdministrator))
//                .keyboardRow(List.of(cashier,locksmith))
//                .keyboardRow(List.of(layoutSpecialist))
//                .keyboardRow(List.of(warehouseWorker))
//                .keyboardRow(List.of(productionManager))
//                .keyboardRow(List.of(shiftSupervisor))
//                .keyboardRow(List.of(productionLineOperator))
//                .keyboardRow(List.of(qualityController))
//                .keyboardRow(List.of(restaurantManager))
//                .keyboardRow(List.of(restaurantAdministrator))
//                .keyboardRow(List.of(cooker,sousChef))
//                .keyboardRow(List.of(waiter, barista))
//                .keyboardRow(List.of(dishwasher))
//                .keyboardRow(List.of(spotManager))
//                .keyboardRow(List.of(seniorCashier))
//                .keyboardRow(List.of(kitchenWorker))
//                .keyboardRow(List.of(customerServiceSpecialist))
//                .keyboardRow(List.of(logisticsManager))
//
//                .keyboardRow(List.of(courier))
//                .keyboardRow(List.of(clientRelationshipSpecialist))
//                .keyboardRow(List.of(logist))
//                .keyboardRow(List.of(equipmentMaintenanceEngineer))
//                .keyboardRow(List.of(warehouseSupervisor))
//                .keyboardRow(List.of(deliveryCoordinator))
//                .keyboardRow(List.of(forwardingDriver))
//                .keyboardRow(List.of(sellingManager))
//                .keyboardRow(List.of(salesRepresentative))
//                .keyboardRow(List.of(salesAssistant))
//                .keyboardRow(List.of(salesFloorCoordinator))
//                .keyboardRow(List.of(dataScientist))
//                .keyboardRow(List.of(storekeeper))
//                .keyboardRow(List.of(purchasingManager))
//                .keyboardRow(List.of(callCentreOperator))
//                .keyboardRow(List.of(packagingSpecialist))
//                .keyboardRow(List.of(receivingSpecialist)).build();
//
//    }
}
