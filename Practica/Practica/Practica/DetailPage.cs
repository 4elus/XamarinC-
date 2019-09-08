using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;

namespace Practica
{
    public class DetailPage : ContentPage
    {
        List<Coffee> CoffeesBag { get; set; }
        Coffee selectedCoffee;
        int priceBag;
        int price;
        Label cart;

        public DetailPage(string name, string srcImage, string description, int price, List<Coffee> Bag, Coffee selectedCoffee, int priceBag)
        {
            var image = new Image { Source = srcImage };
            this.selectedCoffee = selectedCoffee;
            this.priceBag = priceBag;
            this.price = price;
            CoffeesBag = Bag;
           

            Label header = new Label
            {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                Text = name,
                FontAttributes = FontAttributes.Bold,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };


            Label desc = new Label
            {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                Text = description,                
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            cart = new Label
            {
                VerticalTextAlignment = TextAlignment.End,
                HorizontalTextAlignment = TextAlignment.End,
                Text = "Корзина: 0 руб.",
                FontAttributes = FontAttributes.Bold,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            if (priceBag > 0)
                cart.Text = "Корзина: " + priceBag.ToString() + " руб.";

            Label lblPrice = new Label
            {
                VerticalTextAlignment = TextAlignment.End,
                HorizontalTextAlignment = TextAlignment.End,
                Text = price.ToString() + " руб.",
                FontAttributes = FontAttributes.Bold,
                TextColor = Color.Green,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            Button btnPut = new Button
            {

                Text = "Добавить в корзину",    
                BackgroundColor = Color.LimeGreen,
                TextColor = Color.White,
                BorderColor = Color.Gray,
                BorderRadius = 6,
                BorderWidth = 3,
                Image = "bag.png",
                HorizontalOptions = LayoutOptions.Center,
                VerticalOptions = LayoutOptions.Center,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))

            };

            Button back = new Button
            {

                Text = "назад",
                BackgroundColor = Color.Red,
                Image = "back_icon.png",
                TextColor = Color.White,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))

            };


            
            btnPut.Clicked += OnButtonClicked;
            back.Clicked += OnButtonBack;

            this.Content = new StackLayout { Children = { back, header,  image, desc, lblPrice, btnPut, cart } };
        }


        private  void OnButtonClicked(object sender, EventArgs e)
        {
           
            CoffeesBag.Add(selectedCoffee);
            priceBag += price;
            cart.Text = "Корзина: " + priceBag.ToString() + " руб.";
        }

        private async void OnButtonBack(object sender, EventArgs e)
        {
          
            await Navigation.PushModalAsync(new PageFirst(priceBag, CoffeesBag));
        }
    }
}