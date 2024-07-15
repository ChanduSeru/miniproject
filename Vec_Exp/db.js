const mongoose = require('mongoose');

mongoose
  .connect('mongodb://127.0.0.1:27017/mydb')
  .then(() => console.log("Connected to MongoDB"))
  .catch((err) => console.error("MongoDB connection error:", err));

const authSchema = new mongoose.Schema({
  email: {
    type: String,
    required: true,
    unique: true
  },
  password: {
    type: String,
    required: true
  }
});

const auth = mongoose.model('auth', authSchema, 'creds'); // 'creds' is the collection name

module.exports = auth;
