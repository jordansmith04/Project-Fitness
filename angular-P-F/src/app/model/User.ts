export class User{

    // private id:number; 
    private username:string;
    private pass:string;
    private ages:number;
    private height:number;
    private weight:number;

    constructor(username:string, pass:string, ages:number, height:number, weight:number){
        // this.id = id;
        this.username = username;
        this.pass = pass;
        this.ages = ages;
        this.height = height;
        this.weight = weight;
    }

    // public getId():number{
    //     return this.id;
    // }

    // public setId(id:number){
    //     this.id = id;
    // }

    public getUsername():string{
        return this.username;
    }

    public setUsername(username:string){
        this.username = username;
    }

    public getPass():string{
        return this.pass;
    }

    public setPass(pass:string){
        this.pass = pass;
    }

    public getAge():number{
        return this.ages;
    }

    public setAge(ages:number){
        this.ages = ages;
    }

    public getHeight():number{
        return this.height;
    }

    public setHeight(height:number){
        this.height = height;
    }

    public getWeight():number{
        return this.weight;
    }

    public setWeight(weight:number){
        this.weight = weight;
    }
}
