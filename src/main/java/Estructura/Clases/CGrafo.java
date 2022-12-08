/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructura.Clases;

import java.awt.Point;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class CGrafo {
//    public Dictionary<String, Point> Vertices;
//        public Map<String, Integer> Arcos;
//        private Queue<String> Recorrido;
//        private Queue<String> Cola;
//        private Dictionary<String, Boolean> Marca;
//        List<String> Visitados;
//        private int TipoGrafo;
//
//        public CGrafo(int tipo)
//        {
//            Vertices = new Hashtable<String, Point>();
//            Arcos = new Hashtable<String, Integer>();
//            this.TipoGrafo = tipo;
//        }
//        public void AgregarVertice(String vertice, Point posicion)
//        {
//            if (!ExisteVertice(vertice))
//            {
//                Vertices.put(vertice, posicion);
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "Ya existe");
//            }
//
//        }
//        public void EliminarVertice(String vertice)
//        {
//            if (ExisteVertice(vertice))
//            {
//                Map<String, Integer> NuevaLista = new Hashtable<String, Integer>();
//                for(Map.Entry<String, Integer> Arco : Arcos.entrySet())
//                {
//                    
//                        NuevaLista.put(Arco.getKey(), Arco.getValue());
//                    
//                }
//                this.Arcos = NuevaLista;
//                Vertices.remove(vertice);
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "El vertice no");
//            }
//        }
//        public void AgregarArco(String ver1, String ver2)
//        {
//            if (ExisteVertice(ver1) && ExisteVertice(ver2))
//            {
//                if (!ExisteArco(ver1, ver2))
//                {
//                    Arcos.put(ver1.trim() + "_" + ver2.trim(), 0);
//                    if (this.TipoGrafo == 1)
//                        Arcos.put(ver2.trim() + "_" + ver1.trim(), 0);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "El arco ya existe");
//                }
//            }
//            else
//            {
//               JOptionPane.showMessageDialog(null,"Ambos vértices especificados deben existir para poder agregar un arco.");
//            }
//        }
//        public void EliminarArco(String ver1, String ver2)
//        {
//            if (ExisteVertice(ver1) && ExisteVertice(ver2))
//            {
//                if (ExisteArco(ver1, ver2))
//                {
//                    Arcos.remove(ver1.trim() + "_" + ver2.trim());
//                    if (this.TipoGrafo == 1)
//                        Arcos.remove(ver2.trim() + "_" + ver1.trim());
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(null, "El arco no existe");
//                }
//            }
//            else
//            {
//                JOptionPane.showMessageDialog(null, "Se debe de especificar los dos vertices");
//            }
//        }
//        public boolean ExisteVertice(String vertice)
//        {
//            return Vertices.Where(X => X.Key == vertice).count() > 0;
//        }
//        public bool ExisteArco(String ver1, String ver2)
//        {
//            return Arcos.Where(X => X.Key == ver1.Trim() + "_" + ver2.Trim()).Count() > 0;
//        }
//        public Queue<String> RecorridoAnchura(String ver)
//        {
//            Recorrido = new Queue<String>();
//            if (Vertices.Count > 0)
//            {
//                Cola = new Queue<String>();
//                Marca = new Dictionary<String, bool>();
//                Queue<String> VerticesGrafo = ListaDeVerticesDelGrafo(ver);
//                foreach (String V in VerticesGrafo) Marca.Add(V, false);
//                foreach (String V in VerticesGrafo)
//                    if (!Marca[V]) RecorridoNodoAnchura(V);
//            }
//            return Recorrido;
//        }
//        private void RecorridoNodoAnchura(String Vertice)
//        {
//            Marca[Vertice] = true;
//            Cola.Enqueue(Vertice);
//            while (Cola.Count > 0)
//            {
//                String VerticeSacado = Cola.Dequeue();
//                Recorrido.Enqueue(VerticeSacado);
//                foreach (String Hijo in HijosDelNodo(VerticeSacado))
//                {
//                    if (!Marca[Hijo])
//                    {
//                        Marca[Hijo] = true;
//                        Cola.Enqueue(Hijo);
//                    }
//                }
//            }
//        }
//        public Queue<String> RecorridoProfundidad(String ver)
//        {
//            Recorrido = new Queue<String>();
//            if (Vertices.Count > 0)
//            {
//                Marca = new Dictionary<String, bool>();
//                Queue<String> VerticesGrafo = ListaDeVerticesDelGrafo(ver);
//                foreach (String V in VerticesGrafo) Marca.Add(V, false);
//                foreach (String V in VerticesGrafo)
//                    if (!Marca[V]) RecorrerNodoProfundidad(V);
//            }
//            return Recorrido;
//        }
//        private void RecorrerNodoProfundidad(String Vertice)
//        {
//            Marca[Vertice] = true;
//            Recorrido.Enqueue(Vertice);
//            foreach (String H in HijosDelNodo(Vertice))
//                if (!Marca[H]) RecorrerNodoProfundidad(H);
//        }
//        public Queue<String> ListaDeVerticesDelGrafo(String VerticeInicial)
//        {
//            Queue<String> Lista = new Queue<String>();
//            foreach (KeyValuePair<String, Point> Vert in Vertices)
//                if (Vert.Key == VerticeInicial)
//                    Lista.Enqueue(Vert.Key);
//            foreach (KeyValuePair<String, Point> Vert in Vertices)
//                if (!Lista.Contains(Vert.Key))
//                    Lista.Enqueue(Vert.Key);
//            return Lista;
//        }
//        public Queue<String> HijosDelNodo(String Nodo)
//        {
//            Queue<String> Hijos = new Queue<String>();
//            foreach (KeyValuePair<String, int> Arco in Arcos)
//                if (Arco.Key.StartsWith(Nodo)) Hijos.Enqueue(Arco.Key.SubString(Arco.Key.IndexOf('_') + 1, Arco.Key.Length - Arco.Key.IndexOf('_') - 1));
//            return Hijos;
//        }
//
//        public Dictionary<String, int> Dijkstra(String s)
//        {
//            Recorrido = new Queue<String>();
//            Visitados = new List<String>();
//            int n = this.Vertices.Count;
//            Debug.Print("Número de vértices: {0}", n);
//            Dictionary<String, int> Distancia = new Dictionary<String, int>();
//            Dictionary<String, bool> Visto = new Dictionary<String, bool>();
//            foreach (KeyValuePair<String, Point> w in this.Vertices)
//            {
//                Visto.Add(w.Key, false);
//                Distancia[w.Key] = PesoDelArcoEntreNodos(s, w.Key);
//                Debug.Print("Distancia[{0}] = {1}", w.Key, Distancia[w.Key]);
//            }
//            Distancia[s] = 0;
//            Visto[s] = true;
//            bool VistosTodos = true;
//            foreach (KeyValuePair<String, bool> V in Visto)
//                if (!V.Value) VistosTodos = false;
//            while (!VistosTodos)
//            {
//                int DistanciaMinima = 9999999;
//                String VerticeDistanciaMinima = String.Empty;
//                foreach (KeyValuePair<String, bool> D in Visto)
//                    if (!D.Value && Distancia[D.Key] < DistanciaMinima)
//                    {
//                        DistanciaMinima = Distancia[D.Key];
//                        VerticeDistanciaMinima = D.Key;
//                    }
//                Visto[VerticeDistanciaMinima] = true;
//                foreach (String w in HijosDelNodo(VerticeDistanciaMinima))
//                {
//                    if (Distancia[w] > Distancia[VerticeDistanciaMinima] + PesoDelArcoEntreNodos(VerticeDistanciaMinima, w) || Distancia[w] <= 0)
//                    {
//                        Distancia[w] = Distancia[VerticeDistanciaMinima] + PesoDelArcoEntreNodos(VerticeDistanciaMinima, w);
//                        Debug.Print("Distancia[{0}] = {1}", w, Distancia[w]);
//                    }
//
//                }
//                VistosTodos = true;
//                foreach (KeyValuePair<String, bool> V in Visto)
//                    if (!V.Value) VistosTodos = false;
//            }
//            return Distancia;
//        }
//        private int PesoDelArcoEntreNodos(String N1, String N2)
//        {
//            if (Arcos.Where(A => A.Key == N1 + "_" + N2).Count() == 1)
//            {
//                KeyValuePair<String, int> Arco = Arcos.Where(A => A.Key == N1 + "_" + N2).Single();
//                return Arco.Value;
//            }
//            else
//                return -1;
//        }
//        public void GradoVertice(String ver)
//        {
//            if (ExisteVertice(ver))
//            {
//                int ArcosEntrantes = 0;
//                int ArcosSalientes = 0;
//                foreach (KeyValuePair<String, int> Arco in this.Arcos)
//                {
//                    if (Arco.Key.StartsWith(ver))
//                        ArcosSalientes++;
//                    else if (Arco.Key.EndsWith(ver))
//                        ArcosEntrantes++;
//                }
//                String Texto = String.Empty;
//                if (this.TipoGrafo == 0)
//                {
//                    String NL = Environment.NewLine;
//                    Texto = String.Format("GRADO DEL VERTICE [{0}] {1} Arcos salientes: {2} {3} Arcos entrantes: {4} {5} Grado del vértice: {6}", ver, NL, ArcosSalientes, NL, ArcosEntrantes, NL, ArcosEntrantes + ArcosSalientes);
//                }
//                else
//                {
//                    Texto = String.Format("GRADO DEL VERTICE [{0}]: {1}", ver, ArcosSalientes);
//                }
//                MessageBox.Show(Texto);
//            }
//            else
//                MessageBox.Show("El vértice especificado no existe.");
//        }
}
