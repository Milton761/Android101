using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;

namespace MDApp
{
    public partial class Login : ContentPage
    {
        public Login()
        {
            InitializeComponent();


            
        }

        private void OnButtonClickMenu(object sender, EventArgs e)
        {
            Navigation.PushAsync(new MasterDetail());


        }
    }
}
