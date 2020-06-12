
package com.example.recipeapp.view.detail;

import com.example.recipeapp.model.Meals;

public interface DetailView {
  void showLoading();
  void hideLoading();
  void setMeal(Meals.Meal meal);
  void onErrorLoading(String message);
}
