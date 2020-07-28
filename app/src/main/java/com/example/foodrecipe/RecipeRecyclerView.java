package com.example.foodrecipe;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecipeRecyclerView extends RecyclerView.Adapter<RecipeRecyclerView.MyHolder> {
     private Context mContext;
     private List<Recipes> mData;

    public RecipeRecyclerView(Context mContext, List<Recipes> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecipeRecyclerView.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.card_view_recipes,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeRecyclerView.MyHolder holder, final int position) {
        Log.i("TAG",String.valueOf(mData.get(position).getThumbnail()));
        holder.recipeTitle.setText(mData.get(position).getRecipeName());
        holder.recipeImageThumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.recipeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(mContext,RecipeActivity.class);
                intent.putExtra("recipeName",mData.get(position).getRecipeName());
                intent.putExtra("recipeIngredients",mData.get(position).getRecipeIngredients());
                intent.putExtra("recipeMethod",mData.get(position).getRecipeMethod());
                intent.putExtra("recipe",mData.get(position).getRecipe());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        // Getting the widget of the card_view_recipe
        TextView recipeTitle;
        CardView recipeCardView;
        ImageView recipeImageThumbnail;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = (TextView)itemView.findViewById(R.id.cardViewRecipeName);
            recipeImageThumbnail = (ImageView) itemView.findViewById(R.id.cardViewRecipeImage);
            recipeCardView = (CardView)itemView.findViewById(R.id.cardViewLayout);
        }
    }
}
