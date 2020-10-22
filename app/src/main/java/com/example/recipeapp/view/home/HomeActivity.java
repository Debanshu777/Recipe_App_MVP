
package com.example.recipeapp.view.home;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.recipeapp.R;
import com.example.recipeapp.Utils;
import com.example.recipeapp.adapter.RecyclerViewHomeAdapter;
import com.example.recipeapp.adapter.ViewPagerHeaderAdapter;
import com.example.recipeapp.model.Categories;
import com.example.recipeapp.model.Meals;
import com.example.recipeapp.view.category.CategoryActivity;
import com.example.recipeapp.view.detail.DetailActivity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements HomeView {

    public static final String EXTRA_CATEGORY = "category";
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_DETAIL = "detail";
    @BindView(R.id.viewPagerHeader)
    ViewPager viewPagerMeal;
    @BindView(R.id.recyclerCategory)
    RecyclerView recyclerViewCategory;

    HomePresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        presenter=new HomePresenter(this);
        presenter.getMeals();
        presenter.getCategories();
    }

    @Override
    public void showLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.VISIBLE);
        findViewById(R.id.shimmerCategory).setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        findViewById(R.id.shimmerMeal).setVisibility(View.GONE);
        findViewById(R.id.shimmerCategory).setVisibility(View.GONE);
    }

    @Override
    public void setMeal(List<Meals.Meal> meal) {
        ViewPagerHeaderAdapter headerAdapter=new ViewPagerHeaderAdapter(meal,this);
        viewPagerMeal.setAdapter(headerAdapter);
        viewPagerMeal.setPadding(20,0,150,0);
        headerAdapter.notifyDataSetChanged();
        headerAdapter.setOnItemClickListener((v, position) -> {
            TextView mealName= v.findViewById(R.id.mealName);
            Intent intent=new Intent(getApplicationContext(), DetailActivity.class);
            intent.putExtra(EXTRA_DETAIL,mealName.getText().toString());
            startActivity(intent);
        });
    }

    @Override
    public void setCategory(List<Categories.Category> category) {
        RecyclerViewHomeAdapter homeAdapter=new RecyclerViewHomeAdapter(category,this);
        recyclerViewCategory.setAdapter(homeAdapter);
        GridLayoutManager layoutManager=new GridLayoutManager(this,2
                ,GridLayoutManager.VERTICAL,false);
        recyclerViewCategory.setLayoutManager(layoutManager);
        recyclerViewCategory.setNestedScrollingEnabled(true);
        homeAdapter.notifyDataSetChanged();
        homeAdapter.setOnItemClickListener(new RecyclerViewHomeAdapter.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(HomeActivity.this,CategoryActivity.class);
                intent.putExtra(EXTRA_CATEGORY,(Serializable)category);
                intent.putExtra(EXTRA_POSITION,position);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onErrorLoading(String message) {
        Utils.showDialogMessage(this,"Title",message);
    }

}
