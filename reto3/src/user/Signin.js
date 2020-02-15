import React, { Component } from 'react';

class Signin extends Component {
	constructor() {
		super();
		this.state = {
			email: '',
			password: '',
            error: '',
            message: ''
		};
	}


	handleChange = name => event => {
        this.setState({ error: '' });
        this.setState({message: ''})
		this.setState({ [name]: event.target.value });
	};



	clickSubmit = event => {
		event.preventDefault();
		this.setState({ loading: true });
		const { email, password } = this.state;
        
        if (email === password) {
            this.setState({ message: 'Yaga esta prueba'})
        } else {
            this.setState({ error: 'Eso no coincide mi pai'})
        }
	};
	//Form on the signIn
	signInForm = (email, password) => (
		<form>
			<div className="form-group">
				<label className="text-muted">Email</label>
				<input
					onChange={this.handleChange('email')}
					type="email"
					className="form-control"
					value={email}
				/>
			</div>

			<div className="form-group">
				<label className="text-muted">Password</label>
				<input
					onChange={this.handleChange('password')}
					type="password"
					className="form-control"
					value={password}
				/>
			</div>
			<button onClick={this.clickSubmit} className="btn btn raised btn-primary">
				SIGN IN
			</button>
		</form>
	);

	render() {
		const { email, password, error, message } = this.state;
		
		return (
			<div className="container">
				<h2 className="mt-5 mb-5">SIGN IN</h2>

				<div
					className="alert alert-danger"
					style={{ display: error ? '' : 'none' }}
				>
					{error}
				</div>

                <div
					className="alert alert-info"
					style={{ display: message ? '' : 'none' }}
				>
					{message}
				</div>

				

				{this.signInForm(email, password)}

			</div>
		);
	}
}

export default Signin;