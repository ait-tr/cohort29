import React from 'react';
import './App.css';
// eslint-disable-next-line import/no-extraneous-dependencies
import { Route, Routes } from 'react-router-dom';
import Activity from './components/Activity/Activity';
import Cocktail from './components/Cocktail/Cocktail';
import Layout from './components/Layout/Layout';
import Home from './components/Home/Home';
import Products from './components/Products/Products';
import ProductPage from './components/ProductPage/ProductPage';
import Users from './components/Users/Users';
import User from './components/User/User';

function App(): JSX.Element {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<Home />} />
        <Route path="/activity" element={<Activity />} />
        <Route path="/cocktail" element={<Cocktail />} />
        <Route path="/products" element={<Products />} />
        <Route path="/products/:productId" element={<ProductPage />} />
        <Route path="/users" element={<Users />} />
        <Route path="/users/:userId" element={<User />} />
      </Route>
    </Routes>
  );
}

export default App;
