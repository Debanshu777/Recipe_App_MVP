/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 4/7/19 5:49 PM                                               -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.example.recipeapp.view.detail;

import com.example.recipeapp.model.Meals;

public interface DetailView {
  void showLoading();
  void hideLoading();
  void setMeal(Meals.Meal meal);
  void onErrorLoading(String message);
}
