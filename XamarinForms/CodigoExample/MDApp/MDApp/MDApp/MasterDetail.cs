using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection.Emit;
using System.Text;

using Xamarin.Forms;

namespace MDApp
{
    public class MasterDetail : MasterDetailPage
    {
        public MasterDetail()
        {
            Master = new Menu();
            Detail = new Contenido();
        }
    }
}
