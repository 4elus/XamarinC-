using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;

namespace Practica
{
	public class Confirmation : ContentPage
	{

        Label header;
        List<Coffee> Result;
        int price;
        string address;
        Button back;

        public Confirmation (int price, List<Coffee> Result, string address)
		{
            this.price = price;
            this.Result = Result;
            this.address = address;

            header = new Label
            {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                Text = "Благодарим за заказ :)",
             
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            Label body = new Label {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            back = new Button
            {

                Text = "назад",
                Image = "back_icon.png",
                BackgroundColor = Color.Red,
                TextColor = Color.White,
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))

            };

            back.Clicked += OnButtonBack;

            Label bottom = new Label
            {
                VerticalTextAlignment = TextAlignment.End,
                HorizontalTextAlignment = TextAlignment.End,

                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            foreach (Coffee el in Result)
            {
                body.Text += el.Title + " - " + el.Price + "\n";
            }

            body.Text += "\n Ваш адрес: " + address;

            bottom.Text = "Итого: " + price.ToString() + " руб.";

            this.Content = new StackLayout { Children = { header, body, bottom, back } };
        }

        private async void OnButtonBack(object sender, EventArgs e)
        {
            Result.Clear();
            price = 0;
            await Navigation.PushModalAsync(new PageFirst(price, Result));
        }



    }
}