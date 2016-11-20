$(document).ready(function() {
  var app = new foodie.App();
  app.init({
    bootstrap: {
      fonts: ['scoutIcons'],
      modelsUrl: 'res/foodie-all.json'
    }
  });
});
