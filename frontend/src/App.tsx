import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutsChart from "components/DonutsChat";
import Footer from "components/Footer";
import NavBar from "components/NavBar";


function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-4">Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">(%) de Sucesso nas vendas</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">(%) de vendas</h5>
            <DonutsChart />
          </div>
          <div className="py-4">
            <h1 className="text-primary">Tela de Vendas</h1>
          </div>

          <DataTable />
        </div>
      </div>
      <Footer />
    </>
  );
}

export default App;
