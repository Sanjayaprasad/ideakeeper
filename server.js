var express = require('express');
var app = express();
var bodyParser = require('body-parser');
//var exports = module.exports = {};
var knex = require('./db/knex');

app.use(bodyParser.urlencoded({ extended: false }));
app.use(express.static(__dirname + '/public'));

app.get('/ideas', function(req, res) {
  knex('ideas').select()
  .then(function(data){
    res.send(data);
  });
});

app.post('/ideas', function(req, res) {
  knex('ideas').insert(req.body)
  .then(function(id){
    res.redirect('/');
  });
});

var server = app.listen(3000, function(){
  console.log('Listening on Port 3000');
});
