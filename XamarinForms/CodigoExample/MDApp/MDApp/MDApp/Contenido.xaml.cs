using System;
using System.Net.Http;
using Newtonsoft.Json.Linq;

using Xamarin.Forms;
using System.Collections.Generic;
using System.Collections.ObjectModel;

namespace MDApp
{
    public partial class Contenido : ContentPage
    {

        
        public Contenido()
        {
            InitializeComponent();
        }

        private void OnButtonClickSearch(object sender, EventArgs e)
        {
            var httpClient = new HttpClient();
            httpClient.DefaultRequestHeaders.Accept.Add(new System.Net.Http.Headers.MediaTypeWithQualityHeaderValue("application/json"));

            var response = httpClient.GetAsync("http://www.omdbapi.com/?s="+buscador.Text.ToString()+"&page=1").Result;

            string content = response.Content.ReadAsStringAsync().Result;


            var pelicula = JObject.Parse(content);

            ObservableCollection<Pelicula> peliculas = new ObservableCollection<Pelicula>();
            //consultar servicio

            foreach (var result in pelicula["Search"])
            {
                var title = result["Title"];

               

                peliculas.Add(new Pelicula
                {
                    Title = result["Title"].ToString(),
                    imdbID = result["imdbID"].ToString(),
                    Poster = result["Poster"].ToString(),
                    Type = result["Type"].ToString(),
                    Year = result["Year"].ToString()

                });
            }

            mylista.ItemsSource = peliculas;
            
        }
    }
}
