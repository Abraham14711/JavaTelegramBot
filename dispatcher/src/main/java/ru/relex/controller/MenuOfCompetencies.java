package ru.relex.controller;


import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;



import java.util.List;

public class MenuOfCompetencies{

    protected InlineKeyboardMarkup competencies;

    protected MenuOfCompetencies(){
        createMenu();
    }

    private void createMenu(){
        var adaptability = InlineKeyboardButton.builder().text("адаптивность").callbackData("адаптивность").build();
        var accountability = InlineKeyboardButton.builder().text("ответственность").callbackData("ответственность").build();
        var ambition = InlineKeyboardButton.builder().text("амбициозность").callbackData("амбициозность").build();
        var assertiveness = InlineKeyboardButton.builder().text("упорство").callbackData("упорство").build();
        var attention_to_detail = InlineKeyboardButton.builder().text("внимание к деталям").callbackData("внимание к деталям").build();
        var business_orientation = InlineKeyboardButton.builder().text("ориентация на потребности бизнеса").callbackData("ориентация на потребности бизнеса").build();
        var coaching = InlineKeyboardButton.builder().text("обучение и сопровождение").callbackData("обучение и сопровождение").build();
        var comertial_power = InlineKeyboardButton.builder().text("коммерческая энергия").callbackData("коммерческая энергия").build();
        var conduct = InlineKeyboardButton.builder().text("образ действий").callbackData("образ действий").build();
        var conflict_management = InlineKeyboardButton.builder().text("управление конфликтом").callbackData("управление конфликтом").build();
        var controling_process = InlineKeyboardButton.builder().text("контроль выполнения").callbackData("контроль выполнения").build();
        var cooperation = InlineKeyboardButton.builder().text("сотрудничество").callbackData("сотрудничество").build();
        var courage = InlineKeyboardButton.builder().text("смелость").callbackData("смелость").build();
        var creativity = InlineKeyboardButton.builder().text("творческий подход").callbackData("творческий подход").build();
        var customer_orientation = InlineKeyboardButton.builder().text("ориентация на клиента").callbackData("ориентация на клиента").build();
        var decisiveness = InlineKeyboardButton.builder().text("решительность").callbackData("решительность").build();
        var delegating = InlineKeyboardButton.builder().text("делегирование").callbackData("делегирование").build();
        var developing_employees = InlineKeyboardButton.builder().text("развитие сотрудников").callbackData("развитие сотрудников").build();
        var discipline = InlineKeyboardButton.builder().text("дисциплина").callbackData("дисциплина").build();
        var energy = InlineKeyboardButton.builder().text("энергия").callbackData("энергия").build();
        var flexible_behaviour = InlineKeyboardButton.builder().text("гибкость").callbackData("гибкость").build();
        var focus_on_quality = InlineKeyboardButton.builder().text("акцент на качество").callbackData("акцент на качество").build();
        var forming_judgment = InlineKeyboardButton.builder().text("формирование суждений").callbackData("формирование суждений").build();
        var identification_with_management = InlineKeyboardButton.builder().text("идентификация с руководством").callbackData("идентификация с руководством").build();
        var independence = InlineKeyboardButton.builder().text("независимость").callbackData("независимость").build();
        var initiative = InlineKeyboardButton.builder().text("инициатива").callbackData("инициатива").build();
        var innovative_power = InlineKeyboardButton.builder().text("инновационная энергия").callbackData("инновационная энергия").build();
        var insight = InlineKeyboardButton.builder().text("проницательность").callbackData("проницательность").build();
        var integrity = InlineKeyboardButton.builder().text("целостность").callbackData("целостность").build();
        var leadership_of_groups = InlineKeyboardButton.builder().text("командное руководство").callbackData("командное руководство").build();
        var learning_ability = InlineKeyboardButton.builder().text("способность к обучению").callbackData("способность к обучению").build();
        var listening = InlineKeyboardButton.builder().text("умение слушать").callbackData("умение слушать").build();
        var managing = InlineKeyboardButton.builder().text("управление").callbackData("управление").build();
        var need_to_achieve = InlineKeyboardButton.builder().text("потребность в достижениях").callbackData("потребность в достижениях").build();
        var negotating = InlineKeyboardButton.builder().text("ведение переговоров").callbackData("ведение переговоров").build();
        var networking = InlineKeyboardButton.builder().text("сотрудничество").callbackData("сотрудничество").build();
        var organization_sensitivity = InlineKeyboardButton.builder().text("организационная чувствительность").callbackData("организационная чувствительность").build();
        var perseverance = InlineKeyboardButton.builder().text("настойчивость").callbackData("настойчивость").build();
        var persuasiveness = InlineKeyboardButton.builder().text("убедительность").callbackData("убедительность").build();
        var planning_and_organizing = InlineKeyboardButton.builder().text("планирование и организация").callbackData("планирование и организация").build();
        var political_sensivity = InlineKeyboardButton.builder().text("политическая чувствительность").callbackData("политическая чувствительность").build();
        var presenting = InlineKeyboardButton.builder().text("умение преподносить информацию").callbackData("умение преподносить информацию").build();
        var problem_analysis = InlineKeyboardButton.builder().text("анализ проблем").callbackData("анализ проблем").build();
        var result_orientedness = InlineKeyboardButton.builder().text("ориентация на результат").callbackData("ориентация на результат").build();
        var self_development = InlineKeyboardButton.builder().text("саморазвитие").callbackData("саморазвитие").build();
        var sensitivity = InlineKeyboardButton.builder().text("чувствительность").callbackData("чувствительность").build();
        var sociability = InlineKeyboardButton.builder().text("общительность").callbackData("общительность").build();
        var social_awareness = InlineKeyboardButton.builder().text("общественное сознание").callbackData("общественное сознание").build();
        var stress_management = InlineKeyboardButton.builder().text("управление стрессом").callbackData("управление стрессом").build();
        var verbal_expression = InlineKeyboardButton.builder().text("словесное выражение").callbackData("словесное выражение").build();
        var vision = InlineKeyboardButton.builder().text("видение").callbackData("видение").build();
        var workmanship = InlineKeyboardButton.builder().text("мастерство").callbackData("мастерство").build();
        var written_expression = InlineKeyboardButton.builder().text("письменное выражение").callbackData("письменное выражение").build();




        competencies = InlineKeyboardMarkup.builder()
                .keyboardRow(List.of(adaptability,accountability))
                .keyboardRow(List.of(ambition,assertiveness))
                .keyboardRow(List.of(attention_to_detail,forming_judgment))
                .keyboardRow(List.of(business_orientation))
                .keyboardRow(List.of(coaching,comertial_power))
                .keyboardRow(List.of(conduct,conflict_management))
                .keyboardRow(List.of(controling_process,cooperation))
                .keyboardRow(List.of(courage,creativity))
                .keyboardRow(List.of(customer_orientation,decisiveness))
                .keyboardRow(List.of(delegating,developing_employees))
                .keyboardRow(List.of(discipline,energy))
                .keyboardRow(List.of(flexible_behaviour,focus_on_quality))
                .keyboardRow(List.of(identification_with_management))
                .keyboardRow(List.of(independence,initiative))
                .keyboardRow(List.of(innovative_power,insight))
                .keyboardRow(List.of(integrity,leadership_of_groups))
                .keyboardRow(List.of(learning_ability,listening))
                .keyboardRow(List.of(managing,need_to_achieve))
                .keyboardRow(List.of(negotating,networking))
                .keyboardRow(List.of(organization_sensitivity))
                .keyboardRow(List.of(perseverance,persuasiveness))
                .keyboardRow(List.of(planning_and_organizing))
                .keyboardRow(List.of(political_sensivity))
                .keyboardRow(List.of(presenting))
                .keyboardRow(List.of(problem_analysis,result_orientedness))
                .keyboardRow(List.of(self_development,sensitivity))
                .keyboardRow(List.of(sociability,social_awareness))
                .keyboardRow(List.of(stress_management,verbal_expression))
                .keyboardRow(List.of(vision,workmanship))
                .keyboardRow(List.of(written_expression))
                .build();
    }



}
