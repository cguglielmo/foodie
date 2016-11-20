foodie.RecipeOutline = function() {
  foodie.RecipeOutline.parent.call(this);
};
scout.inherits(foodie.RecipeOutline, scout.Outline);

foodie.RecipeOutline.prototype._jsonModel = function() {
  return scout.models.getModel('foodie.RecipeOutline');
};