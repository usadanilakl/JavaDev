
import BaseController from '../controller/BaseController.js';
import EndPoints from '../controller/EndPoints.js';
import Metadata from '../controller/Metadata.js';
import BaseDomeBuilder from '../dom/BaseDomBuilder.js';

class LotoService{
    async getLotosList(){
       let lotos = await new BaseController(EndPoints.LOTO,Metadata.GET).request();
       Metadata.GET;
       let list = new BaseDomeBuilder().getList();
       lotos.forEach(e=>{
        let i = document.createElement('li');
        i.textContent = e.job;
        list.appendChild(i);
       })
       return list;
    }
    
}

export default LotoService;