package com.developers.fitni_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "nutritionPlans")
    @Data
    public class NutritionPlan {
        @Id
        private String id;

        private String athleteId;  // reference to User/Athlete

        private String title;      // e.g., "Weight Loss Plan July 2025"

        private String goal;       // e.g., "Weight Loss", "Muscle Gain"

        private Integer durationDays; // plan length

        private Date startDate;
        private Date endDate;

        private List<NutritionPlanDay> days;
    }

// Each day in the plan has a list of meals

@Data
class NutritionPlanDay {
    private Integer dayNumber;  // 1, 2, 3, ...

    private List<NutritionPlanMeal> meals;
}

// Each meal contains multiple food items with quantity info
@Data
class NutritionPlanMeal {
    private String mealType;  // Breakfast, Lunch, Dinner, Snack

    private List<NutritionPlanItem> items;
}

// A single food item with nutritional info and quantity
@Data
class NutritionPlanItem {
    private String nutritionEntryId;  // Reference to NutritionEntries _id

    private Integer calories;
    private Float protein;
    private Float carbs;
    private Float fat;

    private String portionSize;  // e.g., "150g", "1 cup"
}
