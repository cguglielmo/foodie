foodie.App = function() {
  foodie.App.parent.call(this);
};
scout.inherits(foodie.App, scout.App);

foodie.App.prototype._createDesktop = function(parent) {
  return scout.create('Desktop',
    scout.models.getModel('foodie.Desktop', parent));
};