using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;
using XLabs.Forms.Controls;

namespace Practica
{

    public partial class MainPage : ContentPage
    {

        List<Coffee> Bag;

        public MainPage()
        {
           
             Navigation.PushModalAsync(new NavigationPage(new PageFirst(0, Bag)));
        }

    }
}


