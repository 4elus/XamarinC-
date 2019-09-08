using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;

namespace Practica
{
    public class Cart : ContentPage
    {

        int price;
        int temp;
        Label cart;
        Label header;
        List<Coffee> BagCoffee;
        Entry address;
        Switch switcher;
        StackLayout stackLayout;
        Button btn_сonfirmation;
        Button back;

        public Cart(int price, List<Coffee> BagCoffee)
        {
            //Content = new StackLayout
            //{
            //    //Children = {
            //    //    new Label { Text = "Welcome to Xamarin.Forms! " + price.ToString() }
            //    //}
            //};

            this.price = price;
            this.BagCoffee = BagCoffee;

            header = new Label
            {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                Text = "Коризна",
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            address = new Entry
            {
                Placeholder = "Введите ваш адрес",
                Keyboard = Keyboard.Default
            };

            btn_сonfirmation = new Button
            {

                Text = "Оформить заказ",
                IsEnabled = false,
                Image = "bag_confirm.png",
                BackgroundColor = Color.LimeGreen,
                TextColor = Color.White,
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

            var label3 = new Label()
            {
                Text = "Скидка: ",
                HorizontalOptions = LayoutOptions.CenterAndExpand
            };

            btn_сonfirmation.Clicked +=  OnButtonClicked;
            back.Clicked += OnButtonBack;

            address.TextChanged += ChangedText;

            switcher = new Switch
            {
                HorizontalOptions = LayoutOptions.Center,

                VerticalOptions = LayoutOptions.CenterAndExpand,


            };
            switcher.Toggled += switcher_Toggled;

            

            stackLayout = new StackLayout
            {
                Orientation = StackOrientation.Horizontal,
                HorizontalOptions = LayoutOptions.CenterAndExpand,
                Children = {
                    label3,
                    switcher
                   
                }
            };


            cart = new Label
            {
                VerticalTextAlignment = TextAlignment.End,
                HorizontalTextAlignment = TextAlignment.End,
                Text = "Коризна: " + price + " руб.",
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };


            ListView listView = new ListView
            {
                HasUnevenRows = true,
                ItemsSource = BagCoffee,
                // Определяем формат отображения данных
                ItemTemplate = new DataTemplate(() =>
                {
                    ImageCell imageCell = new ImageCell { TextColor = Color.Red, DetailColor = Color.Green };
        
                    imageCell.SetBinding(ImageCell.TextProperty, "Title");
                    Binding companyBinding = new Binding { Path = "Price", StringFormat = "Цена:  {0}" };
                    imageCell.SetBinding(ImageCell.DetailProperty, companyBinding);
                    imageCell.SetBinding(ImageCell.ImageSourceProperty, "ImagePath");
                    imageCell.SetBinding(EntryCell.KeyboardProperty, "Company");
                    return imageCell;
                })
            };

            

            listView.ItemTapped += OnItemTapped;
            this.Content = new StackLayout { Children = { header, back, listView, stackLayout, address, cart, btn_сonfirmation } };

        }

        void switcher_Toggled(object sender, ToggledEventArgs e)
        {
            if (e.Value)
            {
                temp = price - Convert.ToInt32(price * 0.9);
                price  = Convert.ToInt32(price * 0.9);
                cart.Text = "Корзина: " + price.ToString() + " руб.";
                
            }
            else
            {
                price += temp;
                cart.Text = "Корзина: " + price.ToString() + " руб.";
            }
        }

        public async void OnItemTapped(object sender, ItemTappedEventArgs e)
        {
            Coffee selectedCoffees = e.Item as Coffee;
            if (selectedCoffees != null)
            {
                bool answer = await DisplayAlert("?", "Вы действительно хотите удалить выбранный товар", "Да", "Нет");

                    
                if (answer)
                {
                    price -= selectedCoffees.Price;

                    if (price < 0)
                    {
                        price = 0;
                    }

                    cart.Text = "Корзина: " + price.ToString() + " руб.";
                    BagCoffee.Remove(selectedCoffees);
                    update();
                }

            }

        }

        private async void OnButtonClicked(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Confirmation(price, BagCoffee, address.Text));
            
        }


        private async void OnButtonBack(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new PageFirst(price, BagCoffee));
        }


        private async void ChangedText(object sender, EventArgs e)
        {
            if (address.Text.Length > 0 && BagCoffee.Count > 0)
            {
                btn_сonfirmation.IsEnabled = true;
            }
            else
            {
                btn_сonfirmation.IsEnabled = false;
            }
        }

        private void update()
        {
            ListView listView = new ListView
            {
                HasUnevenRows = true,
                ItemsSource = BagCoffee,
                // Определяем формат отображения данных
                ItemTemplate = new DataTemplate(() =>
                {
                    ImageCell imageCell = new ImageCell { TextColor = Color.Red, DetailColor = Color.Green };
                    imageCell.SetBinding(ImageCell.TextProperty, "Title");
                    Binding companyBinding = new Binding { Path = "Price", StringFormat = "Цена:  {0}" };
                    imageCell.SetBinding(ImageCell.DetailProperty, companyBinding);
                    imageCell.SetBinding(ImageCell.ImageSourceProperty, "ImagePath");
                    return imageCell;
                })
            };

            listView.ItemTapped += OnItemTapped;
            this.Content = new StackLayout { Children = { header, back, listView, stackLayout, address, cart, btn_сonfirmation } };
        }
    }
}