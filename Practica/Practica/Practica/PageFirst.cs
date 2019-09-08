using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Xamarin.Forms;
using XLabs.Forms.Controls;



namespace Practica
{
    public  class PageFirst : ContentPage
    {
        public List<Coffee> Coffees { get; set; }
        public List<Coffee> CoffeesBag { get; set; }
        public List<Coffee> CheckCoffee { get; set; }
        Label header;
        StackLayout stackLayout;

        int price = 0;

        Button cart = new Button
        {

            Text = "Корзина: 0 руб.",
            IsEnabled = false,
            BorderRadius = 6,
            BorderWidth = 3,
            Image = "toBag.png",
            HorizontalOptions = LayoutOptions.Center,
            VerticalOptions = LayoutOptions.Center,
            FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
        };


        public PageFirst(int price, List<Coffee> Bag)
        {
            this.price = price;
            CoffeesBag = Bag;

            ToolbarItem logIn = new ToolbarItem
            {
                Text = "Войти",
                Order = ToolbarItemOrder.Primary,
                Priority = 0,
                Icon = new FileImageSource
                {
                    File = "logIn.png"
                }
            };

            ToolbarItem reg = new ToolbarItem
            {
                Text = "Регистрация",
                Order = ToolbarItemOrder.Secondary,
                Priority = 1
            };

            ToolbarItem aboutUs = new ToolbarItem
            {
                Text = "О нас",
                Order = ToolbarItemOrder.Secondary,
                Priority = 2
            };

            logIn.Clicked += async (s, e) =>
            {

                if (logIn.Icon.ToString().Contains("logIn"))
                {

                    logIn.Icon = new FileImageSource
                    {
                        File = "logout.png"
                    };
                }
                else
                {

                    logIn.Icon = new FileImageSource
                    {
                        File = "logIn.png"
                    };
                }

            };

            ToolbarItems.Add(logIn);
            ToolbarItems.Add(reg);
            ToolbarItems.Add(aboutUs);
            
            cart.Text = "Корзина: " + price.ToString() + " .руб";

            if (price > 0)
            {
                cart.IsEnabled = true;
            }
            else
            {
                cart.IsEnabled = false;
            }

            Coffees = new List<Coffee>
            {
                new Coffee {Title="Черный кофе", Company="American travel", Desc="Это крепкий черный кофе. Подается и пьется очень быстро.", Price=48, ImagePath="black_cofe.jpg", Type = 1},
                new Coffee {Title="Капучино", Company="Coffee Island", Desc="Капучино - смесь эспрессо и вспененного молока - второй по популярности кофейный напиток в мире.", Price=35, ImagePath="capuchino.jpg", Type = 1 },
                new Coffee {Title="Кофе с шоколадом", Company="Good morning", Desc="Кофе с шоколадом не только вкусно, но и полезно", Price=42, ImagePath="cofe_choco.jpg", Type = 1 },
                new Coffee {Title="Кофе с молоком", Company="Sun Rise", Desc="Кофе с молоком приготавливаемый путём смешивания порции кофе с горячим молоком.", Price=52, ImagePath="cofe_milk.jpg", Type = 1 },
                new Coffee {Title="Булочка с сахаром", Company="Roshen", Desc="Выпечка из дрожжевого теста", Price=25, ImagePath="bulochka_sahar.jpg", Type = 2 },
                new Coffee {Title="Рогалик", Company="Roshen", Desc="Рогалик — хлебобулочное изделие.", Price=25, ImagePath="rogalik.jpg", Type = 2 }
            };

            
            if (price <= 0)
            {
                CoffeesBag = new List<Coffee> { };
            }

            CheckCoffee = new List<Coffee> { };



            CheckBox food = new CheckBox { Checked = true, DefaultText = "Еда" };
            CheckBox drink = new CheckBox { Checked = true, DefaultText = "Кофе" };

            header = new Label
            {
                VerticalTextAlignment = TextAlignment.Center,
                HorizontalTextAlignment = TextAlignment.Center,
                Text = "Список товаров",
                FontSize = Device.GetNamedSize(NamedSize.Large, typeof(Label))
            };

            stackLayout = new StackLayout
            {
                Orientation = StackOrientation.Horizontal,
                HorizontalOptions = LayoutOptions.CenterAndExpand,
                Children = {
                   drink,
                   food

                }
            };

            drink.CheckedChanged += (sender, e) =>
            {
                // Perform required operation after examining e.Value
                CheckCoffee.Clear();

                if (e.Value)
                {
                    foreach (Coffee el in Coffees)
                    {
                        if (el.Type == 1)
                        {
                            CheckCoffee.Add(el);
                        }
                        else if (food.Checked)
                        {
                            CheckCoffee.Add(el);
                        }
                    }
                }
                else
                {
                    foreach (Coffee el in Coffees)
                    {
                        if (el.Type == 1)
                        {
                            CheckCoffee.Remove(el);
                        }
                        else if (food.Checked)
                        {
                            CheckCoffee.Add(el);
                        }
                    }
                }

                update();

            };

            food.CheckedChanged += (sender, e) =>
            {
                // Perform required operation after examining e.Value
                CheckCoffee.Clear();

                if (e.Value)
                {
                    foreach (Coffee el in Coffees)
                    {
                        if (el.Type == 2)
                        {
                            CheckCoffee.Add(el);
                        }
                        else if (drink.Checked)
                        {
                            CheckCoffee.Add(el);
                        }
                    }
                }
                else
                {
                    foreach (Coffee el in Coffees)
                    {
                        if (el.Type == 2)
                        {
                            CheckCoffee.Remove(el);
                        }
                        else if (drink.Checked)
                        {
                            CheckCoffee.Add(el);
                        }
                    }
                }

                update();

            };


            cart.Clicked += OnButtonClicked;


            ListView listView = new ListView
            {
                HasUnevenRows = true,
                ItemsSource = Coffees,
                // Определяем формат отображения данных
                ItemTemplate = new DataTemplate(() =>
                {
                    ImageCell imageCell = new ImageCell { TextColor = Color.Red, DetailColor = Color.Green };
                    imageCell.SetBinding(ImageCell.TextProperty, "Title");
                    Binding companyBinding = new Binding { Path = "Price", StringFormat = "Цена:  {0}" };
                    imageCell.SetBinding(ImageCell.DetailProperty, companyBinding);

                    imageCell.SetBinding(ImageCell.ImageSourceProperty, "ImagePath");
                    //imageCell.SetBinding(ListViewImageCell.ImageSourceProperty, new Binding(nameof(PhotoItem.PhotoUrl)));
                    return imageCell;
                })
            };


            listView.ItemTapped += OnItemTapped;
            this.Content = new StackLayout { Children = { header, listView, stackLayout, cart } };
        }



        public async void OnItemTapped(object sender, ItemTappedEventArgs e)
        {
            Coffee selectedCoffees = e.Item as Coffee;


            await Navigation.PushModalAsync(new DetailPage(selectedCoffees.Title, selectedCoffees.ImagePath, selectedCoffees.Desc, selectedCoffees.Price, CoffeesBag, selectedCoffees, price));

            //if (selectedCoffees != null)
            //{
            //    await DisplayAlert("Выбранный товар", $"{selectedCoffees.Company} - {selectedCoffees.Title}", "OK");

            //    price += selectedCoffees.Price;
            //    cart.Text = "Корзина: " + price.ToString() + " руб.";
            //    CoffeesBag.Add(selectedCoffees);

            //}

            //if (price > 0)
            //{
            //    cart.IsEnabled = true;
            //}
            //else
            //{
            //    cart.IsEnabled = false;
            //}

        }

        private async void OnButtonClicked(object sender, EventArgs e)
        {
            await Navigation.PushModalAsync(new Cart(price, CoffeesBag));
        }





        private void update()
        {
            ListView listView = new ListView
            {
                HasUnevenRows = true,
                ItemsSource = CheckCoffee,
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
            this.Content = new StackLayout { Children = { header, listView, stackLayout, cart } };
        }

    }
}