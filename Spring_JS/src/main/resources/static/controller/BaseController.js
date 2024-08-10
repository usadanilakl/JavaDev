class BaseController{
    constructor(url,metadata){
        this.url = url;
        this.metadata = metadata;
    }

    async request(){
        const request = await fetch(this.url,this.metadata);
        const data = await request.json();
        return data;
    }
    async getRequest(){
        const request = await fetch(this.url);
        const data = await request.json();
    }
}

export default BaseController;