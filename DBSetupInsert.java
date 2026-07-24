package com.project.foodmathsbymichael.foodmathsbymichael;

import android.content.Context;

/**
 * Created by Michael on 30/05/2020.
 */


import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

public class DBSetupInsert {

    /* Variables */
    private final Context context;

    /* Public Class ------------------------------------------------------ */
    public DBSetupInsert(Context ctx) {
        this.context = ctx;
    }


    /* Setup Insert To Categories ----------------------------------------- */
    // To insert to category table
    public void setupInsertToCategories(String values) {
        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("categories",
                    "_id, category_name, category_parent_id, category_icon, category_note",
                    values);
            db.close();
        } catch (SQLiteException e) {
            // Toast.makeText(context, "Error; Could not insert categories.", Toast.LENGTH_SHORT)
            // .show();
        }
    }

    public void insertAllCategories() {
        setupInsertToCategories("NULL, 'Grains', '0', '', NULL");
        setupInsertToCategories("NULL, 'Breads', '1', '', NULL");
        setupInsertToCategories("NULL, 'Cereals', '1', '', NULL");
        setupInsertToCategories("NULL, 'Pasta', '1', '', NULL");
        setupInsertToCategories("NULL, 'Rice', '1', '', NULL");
        setupInsertToCategories("NULL, 'Noodles', '1', '', NULL");

        // Parent id: 7
        setupInsertToCategories("NULL, 'Vegetables', '0', '', NULL");
        setupInsertToCategories("NULL, 'Leafy Green', '7', '', NULL");
        setupInsertToCategories("NULL, 'Root', '7', '', NULL");

        //Parent id: 10
        setupInsertToCategories("NULL, 'Fruit', '0', '', NULL");
        setupInsertToCategories("NULL, 'Citrus', '10', '', NULL");
        setupInsertToCategories("NULL, 'Berries', '10', '', NULL");

        //parent id 13
        setupInsertToCategories("NULL, 'Dairy', '0', '', NULL");
        setupInsertToCategories("NULL, 'Milk', '13', '', NULL");
        setupInsertToCategories("NULL, 'Cheese', '13', '', NULL");
        setupInsertToCategories("NULL, 'Yoghurt', '13', '', NULL");

        //parent id 17
        setupInsertToCategories("NULL, 'Proteins', '0', '', NULL");
        setupInsertToCategories("NULL, 'Meat', '17', '', NULL");
        setupInsertToCategories("NULL, 'Fish', '17', '', NULL");
        setupInsertToCategories("NULL, 'Poultry', '17', '', NULL");
        setupInsertToCategories("NULL, 'Eggs', '17', '', NULL");
        setupInsertToCategories("NULL, 'Nuts', '17', '', NULL");

    }


    /* Setup Insert To Food ----------------------------------------------- */
    // To insert food to food table
    public void setupInsertToFood(String values) {

        try {
            DBAdapter db = new DBAdapter(context);
            db.open();
            db.insert("food",
                    "_id, food_name, food_manufactor_name, food_serving_size_gram, " +
                            "food_serving_size_gram_mesurment, food_serving_size_pcs, " +
                            "food_serving_size_pcs_mesurment, food_energy, food_proteins, " +
                            "food_carbohydrates, food_fat, food_energy_calculated, " +
                            "food_proteins_calculated, food_carbohydrates_calculated, " +
                            "food_fat_calculated, food_user_id, food_barcode, food_category_id, " +
                            "food_thumb, food_image_a, food_image_b, food_image_c, food_notes",
                    values);
            db.close();
        } catch (SQLiteException e) {
            // Toast.makeText(context, "Error; Could not insert food.", Toast.LENGTH_SHORT).show();
        }

    }

    // Insert all food into food database
    public void insertAllFood() {
        setupInsertToFood("NULL, 'French Stick', 'Tesco', '100', 'grams', '2', 'servings', '290'," +
                " '9.6', '60', '3', '290', '9.6', '60', '3', NULL, NULL, '2', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Shreddies', 'Nestle', '50', 'grams', '1', 'bowl', '180', '5', " +
                "'35', '1', '90', '2.5', '17.5', '0.5', NULL, NULL, '3', NULL, NULL, NULL, NULL, " +
                "NULL");
        setupInsertToFood("NULL, 'Spaghetti', 'Barilla', '50', 'grams', '1', 'serving', '160', " +
                "'6.5', '31', '1.3', '160', '6.5', '31', '1.3', NULL, NULL, '4', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Rice', 'Daawat', '75', 'grams', '1', 'serving', '262', '6.1', " +
                "'57.9', '0.5', '262', '6.1', '57.9', '0.5', NULL, NULL, '5', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Pot Noodle', 'Pot Noodle', '300', 'grams', '1', 'pot', '384', " +
                "'9.6', '54', '14.1', '384', '9.6', '54', '14.1', NULL, NULL, '6', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Broccoli', 'Asda', '100', 'grams', '1', 'serving', '31', '2.5'," +
                " '6.0', '2.4', '31', '2.5', '6.0', '2.4', NULL, NULL, '8', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Carrot', 'Asda', '100', 'grams', '1', 'serving', '41', '0.9', " +
                "'9.6', '0.2', '41', '0.9', '9.6', '0.2', NULL, NULL, '9', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Orange', 'Asda', '130', 'grams', '1', 'orange', '131', '1.2', " +
                "'27', '0.1', '131', '1.2', '27', '0.1', NULL, NULL, '11', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Strawberries', 'Asda', '100', 'grams', '1', 'serving', '32', " +
                "'0.7', '7.7', '0.3', '32', '0.7', '7.7', '0.3', NULL, NULL, '12', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Whole Milk', 'Cravendale', '240', 'grams', '1', 'cup', '149', " +
                "'7.7', '11.7', '8', '149', '7.7', '11.7', '8', NULL, NULL, '14', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Cheddar', 'Cathedral City', '50', 'grams', '0.1', 'block', " +
                "'200', '12', '1', '16', '200', '12', '1', '16', NULL, NULL, '15', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Muller Corner', 'Muller', '135', 'grams', '1', 'pack', '144', " +
                "'3.7', '20', '5.2', '144', '3.7', '20', '5.2', NULL, NULL, '16', NULL, NULL, " +
                "NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Sirloin Steak', 'Asda Butchers', '205', 'grams', '1', " +
                "'serving', '205', '21.6', '0', '12.7', '205', '21.6', '0', '12.7', NULL, NULL, " +
                "'18', NULL, NULL, NULL, NULL, NULL");
        setupInsertToFood("NULL, 'Salmon', 'Asda', '175', 'grams', '0.5', 'fillet', '367', '39', " +
                "'0', '22', '367', '39', '0', '22', NULL, NULL, '19', NULL, NULL, NULL, NULL, " +
                "NULL");
        setupInsertToFood("NULL, 'Chicken Breast', 'Asda', '150', 'grams', '1', 'serving', '159'," +
                " '36', '1.7', '0', '159', '36', '1.7', '0', NULL, NULL, '20', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Egg', 'HappyEggCo', '100', 'grams', '2', 'egg', '131', '12.6', " +
                "'0.5', '9.0', '131', '12.6', '0.5', '9', NULL, NULL, '21', NULL, NULL, NULL, " +
                "NULL, NULL");
        setupInsertToFood("NULL, 'Wallnuts', 'Asda', '30', 'grams', '1', 'cup', '200', '5', '4', " +
                "'20', '200', '5', '4', '20', NULL, NULL, '22', NULL, NULL, NULL, NULL, NULL");

    }


}
